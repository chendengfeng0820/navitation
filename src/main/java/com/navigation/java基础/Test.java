package com.navigation.java基础;

/**
 * @author: cdf
 * @create: 2020-02-26 16:22
 **/
public class Test {

    public static void main(String[] args) {

        Student t=new Student("cdf",18,"天职师大");
        Person p=new Person("xxx",1);

        Person p1=new Student("xxxx",1,"xxx");
        Student s1= (Student) new Person("xx",1);
        t.study();
        t.speak();
    }


}

class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  void speak(){
        System.out.println("我叫："+name+" 年龄："+age);
    }
}

class Student extends Person{

    public String school;
    public Student(String name, int age,String school) {
        super(name, age);
        this.school=school;
    }
    public void study(){
        System.out.println("我在："+school+"上学");
    }
}
