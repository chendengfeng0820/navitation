package com.navigation.java基础;

/**
 * @author: cdf
 * @create: 2020-02-26 16:20
 **/
public class Book {

    public String title;
    public double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }



    public void printInfo(){
        System.out.println("书名:"+title+"  价钱："+price);
    }

     static void print(){
        System.out.println();
    }
}


