package com.example.homework;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class HomeWorkTest {

    @Test
    public void testGetInput() {
        HomeWork homeWork = new HomeWork();
        List<Integer> input = homeWork.getInput();
        assertEquals(8, input.size());
    }

}