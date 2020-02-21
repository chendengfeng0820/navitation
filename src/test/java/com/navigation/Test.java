package com.navigation;

import com.navigation.amap.MapNavUtil;

/**
 * @author: cdf
 * @create: 2020-02-21 13:51
 **/
public class Test {
	public static void main(String[] args) {
		String origin="116.481028,39.989643";//出发点经纬度  beijing116°20′、北纬39°56′
		String destination="116.434446,39.90816";//目的地经纬度
		String key="99435e9bf38a6ccfbabe654ba78e6a5f";//高德用户key

		MapNavUtil mapResult=new MapNavUtil(origin, destination, key);

		System.out.println(mapResult.getResults().toString());
	}
}
