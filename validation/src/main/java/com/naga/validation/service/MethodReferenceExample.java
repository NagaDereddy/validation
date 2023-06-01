package com.naga.validation.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodReferenceExample {


    public static void main(String[] args) {

        ExamplInterface exmlInterStatic=MethodReferenceExample::staticReference;;

        MethodReferenceExample instanceReference=new MethodReferenceExample();

        ExamplInterface exmlInterInstance=instanceReference::instanceReference;

        exmlInterStatic.methodRefence();
        exmlInterInstance.methodRefence();



    }

    public static void staticReference(){
        System.out.println("from Static method reference");
    }

    public  void instanceReference(){
        System.out.println("from Instance method reference");
    }

}
