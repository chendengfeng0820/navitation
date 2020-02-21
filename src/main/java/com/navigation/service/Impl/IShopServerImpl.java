package com.navigation.service.Impl;

import com.navigation.mapper.ShopMapper;
import com.navigation.pojo.Shop;
import com.navigation.service.IShopServer;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-02-21 22:32
 **/
public class IShopServerImpl implements IShopServer {

    private ShopMapper shopMapper;

    public IShopServerImpl(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public void saveshop(Shop shop) {
        shopMapper.saveshop(shop);
    }

    @Override
    public void deleteshop(String name) {
        shopMapper.deleteshop(name);
    }

    @Override
    public void updateshop(Shop shop) {
        shopMapper.updateshop(shop);
    }

    @Override
    public Shop findshop(String name) {
        return shopMapper.findshop(name);
    }

    @Override
    public List<String> oneandleft() {
        return shopMapper.oneandleft();
    }

    @Override
    public List<String> oneandright() {
        return shopMapper.oneandright();
    }

    @Override
    public List<String> twoandleft() {
        return shopMapper.twoandleft();
    }

    @Override
    public List<String> twoandright() {
        return shopMapper.twoandright();
    }
}
