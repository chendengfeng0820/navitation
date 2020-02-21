package com.navigation.service;

import com.navigation.pojo.Shop;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-02-21 22:29
 **/
public interface IShopServer {

    void saveshop(Shop shop);

    void deleteshop(String name);

    void updateshop(Shop shop);

    Shop findshop(String name);

    List<String> oneandleft();

    List<String> oneandright();

    List<String> twoandleft();

    List<String> twoandright();
}
