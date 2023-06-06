package com.naga.validation.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class MethodReferenceExample {


    /*public static void main(String[] args) {

        ExamplInterface exmlInterStatic=MethodReferenceExample::staticReference;;

        MethodReferenceExample instanceReference=new MethodReferenceExample();

        ExamplInterface exmlInterInstance=instanceReference::instanceReference;

        exmlInterStatic.methodRefence();
        exmlInterInstance.methodRefence();

        String[] words = new String[10];

       // words[0]="naga";
        words= new String[]{"jay", "deva","reddy","mallika","keshava","naga"};


        Optional<String> checkValue=Optional.ofNullable(words[5]);
        if (checkValue.isPresent()){
            String word = words[5].toLowerCase();
            System.out.print(word);
        }else{
            System.out.println("no values present in side");
        }

    }
*/
    public static void staticReference(){
        System.out.println("from Static method reference");
    }

    public  void instanceReference(){
        System.out.println("from Instance method reference");
    }

}
