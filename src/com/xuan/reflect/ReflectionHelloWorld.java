package com.xuan.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 1、类反射使用的步骤：<br>
 * (1)Class c=Class.forName("类全名：包名[.子包名].类名");<br>
 * (2)调用c对象中的成员方法：Field(字段)、Method(方法)、Constructor(构造方法)、Modifier(静态方法和常量)<br>
 * (3)遍历出所有信息<br>
 *
 * @author <a"283505495@qq.com">lxd</a>
 * @version 1.0 2017-4-15 下午12:30:31
 * @fileName ReflectionHelloWorld.java
 */
public class ReflectionHelloWorld {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.xuan.reflect.UserModel");
            /*
             * 提供有关类或接口的单个字段信息，以及对他的动态访问权限
             */
            System.out.println("获取类里面的所有字段：");
            Field[] flds = c.getDeclaredFields();
            for (Field fild : flds) {
                System.out.println(fild);
            }
            System.out.println("------------------------");
            /*
             *  提供关于类的单个构造方法的信息以及对它的访问权限。得到的构造方法只能是public类型的。
             */
            System.out.println("获取公有构造方法及构造方法里面的参数：");
            Constructor[] cons = c.getConstructors();
            for (Constructor con : cons) {
                System.out.println(con);
            }
            System.out.println("------------------------");
            /*
             * 返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，
             * 包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
             */
            System.out.println("获取类里面的所有方法：");
            Method[] ms = c.getDeclaredMethods();
            for (Method m : ms) {
                System.out.println(m);
            }
            System.out.println("------------------------");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
