package com.navigation.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.navigation.mapper.ShopMapper;
import com.navigation.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cdf
 * @create: 2020-02-21 22:47
 **/

@RestController()
public class ShopController {

    @Autowired
    private ShopMapper shopMapper;

    @RequestMapping("/saveshop")
    public String saveshop(@RequestBody JSONObject jsonObject){
        Shop shop= JSON.parseObject(jsonObject.toString(),Shop.class);
        shop.setFloor(shop.getFloor());
        shop.setName(shop.getName());
        shop.setLocation(shop.getLocation());
        shopMapper.saveshop(shop);
        return "t";

    }

    @RequestMapping("/updateshop")
    public String updateshop(@RequestBody JSONObject jsonObject){
        Shop shop=JSON.parseObject(jsonObject.toString(),Shop.class);
        shop.setName(shop.getName());
        shop.setFloor(shop.getFloor());
        shop.setLocation(shop.getLocation());
        shopMapper.updateshop(shop);
        return "t";
    }

    @RequestMapping("/deleteshop")
    public String deleteshop(@RequestBody JSONObject jsonObject){
        Shop shop=JSON.parseObject(jsonObject.toString(),Shop.class);
        String name=shop.getName();
        shopMapper.deleteshop(name);
        return "t";
    }

    @RequestMapping("/findshop")
    public String findshop(@RequestBody JSONObject jsonObject){
        Shop shop=JSON.parseObject(jsonObject.toString(),Shop.class);
        String name=shop.getName();
        Shop s=shopMapper.findshop(name);
        return JSON.toJSONString(s);
    }
}
