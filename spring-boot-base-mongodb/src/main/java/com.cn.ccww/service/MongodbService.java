package com.cn.ccww.service;

import com.cn.ccww.dto.AddressDTO;
import com.cn.ccww.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: ccww
 * @Date: 2019/10/9 20:48
 * @Description: 
 */
@Service
public class MongodbService {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 新增文档
     *
     * @param userDTO
     * @return
     */
    public UserDTO insert(UserDTO userDTO) {
        //insert方法并不提供级联类的保存，所以级联类需要先自己先保存
        return mongoTemplate.insert(userDTO);
    }

    public UserDTO save(UserDTO userDTO) {
        Sort sort = new Sort(Sort.Direction.DESC, "name");
        userDTO = mongoTemplate.findOne(Query.query(Criteria.where("")).with(sort), UserDTO.class);
        return mongoTemplate.save(userDTO);
    }

    /**
     * 删除文档
     * NOTE:remove方法不支持级联删除所以要单独删除子数据
     * @param name
     */
    public void remove(String name) {
        //根据名字查询数据并删除
        UserDTO userDTO = mongoTemplate.findOne(Query.query(Criteria.where("name").is(name)), UserDTO.class);
        //remove方法不支持级联删除所以要单独删除子数据
        List<AddressDTO> addressList = userDTO.getAddressDTOS();
        for (AddressDTO addressDTO : addressList) {
            mongoTemplate.remove(addressDTO);
        }
        //删除主数据
        mongoTemplate.remove(userDTO);
    }

    /**
     * 更新文档
     * @param userDTO
     */
    public void update(UserDTO userDTO) {
        mongoTemplate.updateFirst(Query.query(Criteria.where("name").is(userDTO.getUserName())), Update.update("age", userDTO.getUserAge()), UserDTO.class);
    }

    /**
     * 查询文档
     * @param name
     */
    public void find(String name) {
        Sort sort = new Sort(Sort.Direction.DESC, "name");
        List<UserDTO> userDTOS = mongoTemplate.find(Query.query(Criteria.where("name").is(name)), UserDTO.class);
        //基于sort排序使用findOne查询最新一条记录
        UserDTO userDTO = mongoTemplate.findOne(Query.query(Criteria.where("name").is(name)).with(sort), UserDTO.class);
        //模糊查询
        List<UserDTO> userDTOList = mongoTemplate.find(Query.query(Criteria.where("name").is(name).regex(name)).with(sort), UserDTO.class);
        //分页查询
        Pageable pageable = PageRequest.of(3, 20, sort);
        List<UserDTO> userDTOPageableList = mongoTemplate.find(Query.query(Criteria.where("name").is(name)).with(pageable), UserDTO.class);
        //总数
        long conut = mongoTemplate.count(Query.query(Criteria.where("name").is(name)), UserDTO.class);
        Page<UserDTO> page = new PageImpl(userDTOPageableList, pageable, conut);
    }
}

