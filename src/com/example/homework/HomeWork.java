package com.example.homework;

import com.example.homework.utils.BasicLinkedList;
import com.example.homework.utils.HomeWorkHelper;

import java.util.List;

/**
 * java -jar out/artifacts/homework_jar/homework.jar
 */
public class HomeWork {
    private final HomeWorkHelper homeWorkHelper = new HomeWorkHelper();

    public static void main(String[] args) {
        System.out.println("Hello, World!");


        HomeWorkHelper homeWorkHelper = new HomeWorkHelper();

        List<Integer> input = homeWorkHelper.getInput();
        for(Integer integer : input) {
            System.out.println(integer);
        }

        BasicLinkedList basicLinkedList = new BasicLinkedList();

        for(Integer integer : input) {
            basicLinkedList.insert(integer);
            basicLinkedList.print();
        }
    }
}
