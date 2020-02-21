package com.navigation.mapper;

import com.navigation.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ShopMapper {

    void saveshop(Shop shop);

    void deleteshop(String name);

    void updateshop(Shop shop);

    Shop findshop(String name);

    List<String> oneandleft();

    List<String> oneandright();

    List<String> twoandleft();

    List<String> twoandright();
}
