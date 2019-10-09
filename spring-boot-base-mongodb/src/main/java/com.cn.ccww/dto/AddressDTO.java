package com.cn.ccww.dto;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Auther: ccww
 * @Date: 2019/10/9 20:49
 * @Description: 
 */
@Document(collection = "address")
public class AddressDTO {
    private String province;
    private String city;
    private String region;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
