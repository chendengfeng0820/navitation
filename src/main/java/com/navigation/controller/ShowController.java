package com.navigation.controller;

import com.navigation.mapper.ShopMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: cdf
 * @create: 2020-02-21 23:53
 **/
@RestController
public class ShowController {

    private ShopMapper shopMapper;

    public ShowController(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }


    @RequestMapping("/show")
    public String show(){
        List oneleft=shopMapper.oneandleft();
        List oneright=shopMapper.oneandright();
        List twoleft=shopMapper.twoandleft();
        List tworight=shopMapper.twoandright();
        String [][] oneshow=new String[2][oneright.size()>oneleft.size()?oneright.size():oneleft.size()];
        String [][] twoshow=new String[2][twoleft.size()>tworight.size()?twoleft.size():tworight.size()];


        System.out.print("左边的店铺：");
        for (int i=0;i<oneshow.length;i++){
            for(int j=0;j<oneshow[i].length;j++){
                oneshow[i][j]=String.valueOf(oneleft.get(j));
                if(i==0){
                    System.out.print(oneshow[i][j]=String.valueOf(oneleft.get(j)));
                }
            }
        }

        System.out.println();
        System.out.print("右边的店铺：");
        for (int i=0;i<oneshow.length;i++){
            for(int j=0;j<oneshow[i].length;j++){
                oneshow[i][j]=String.valueOf(oneright.get(j));
                if(i==0){
                    System.out.print(oneshow[i][j]=String.valueOf(oneright.get(j)));
                }
            }
        }
//        oneshow[0][0]= String.valueOf(oneleft.get(0));
//        oneshow[0][1]= String.valueOf(oneleft.get(1));
//        oneshow[0][2]= String.valueOf(oneleft.get(2));
//        oneshow[0][3]= String.valueOf(oneleft.get(3));
//        oneshow[1][0]= String.valueOf(oneright.get(0));
//        oneshow[1][1]= String.valueOf(oneright.get(1));
//        oneshow[1][2]= String.valueOf(oneright.get(2));
//        oneshow[1][3]= String.valueOf(oneright.get(3));
//        for(int i=0;i<oneshow.length;i++){
//            if(i==0){
//                System.out.print("左边的店铺：");
//            }else {
//                System.out.print("右边的店铺：");
//            }
//            for(int j=0;j<oneshow[i].length;j++){
//                System.out.print(oneshow[i][j]+"  ");
//                if(j==oneshow[i].length-1){
//                    System.out.println();
//                }
//            }
//        }
        return "t";

    }


}
