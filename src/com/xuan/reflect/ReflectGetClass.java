package com.xuan.reflect;


/**
 * 1、演示获取Class c对象的三种方法
 *@author <a"283505495@qq.com">lxd</a>
 *@version 1.0 2017-4-15 下午2:57:05
 *@fileName ReflectGetClass.java
 */
public class ReflectGetClass {

    /**
     * 法1：通过对象---对象.getClass()来获取c(一个Class对象)
     */
    public void get1(){
        UserModel p=new UserModel("1","Jack", 23,"123");
        Class c=p.getClass();
        System.out.println(c);
        //来自Object方法
    }

    /**
     * 法2：通过类(类型)---任何数据类型包括(基本数据类型)都有一个静态的属性class ，他就是c 一个Class对象
     */
    public void get2(){
        Class c=UserModel.class;
        Class c2=int.class;
        System.out.println(c);
        System.out.println(c2);

    }

    /**
     * 法3：通过字符串(类全名 )---能够实现解耦：Class.forName(str)
     */
    public void get3(){
        try {
            Class c = Class.forName("com.xuan.reflect.UserModel");
            System.out.println(c);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectGetClass reflectGetClass=new ReflectGetClass();
        reflectGetClass.get1();
        reflectGetClass.get2();
        reflectGetClass.get3();
    }

}
