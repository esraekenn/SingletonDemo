package com.pordiva.esraeken.singletondemo;

/**
 * Created by esraeken on 24/08/16.
 */
public class SingletonDemo

{

    private  static SingletonDemo instance;
    private  SingletonDemo(){}
    public  synchronized  static SingletonDemo getInstance()
    {

        if (instance==null)
        {
            instance=new SingletonDemo();
        }
        return  instance;

    }
    public  void  printHello()
    {

        System.out.println("esra");
    }

}
