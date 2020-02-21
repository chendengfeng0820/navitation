package com.navigation.pojo;

import java.io.Serializable;

/**
 * @author: cdf
 * @create: 2020-02-21 22:28
 **/
public class Shop implements Serializable {

    private Integer id;


    private Integer floor;
    private String name;
    private String location;

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", floor=" + floor +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

