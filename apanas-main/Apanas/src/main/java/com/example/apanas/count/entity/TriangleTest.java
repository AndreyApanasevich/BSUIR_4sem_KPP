package com.example.apanas.count.entity;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void getFirstStoron() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(3, triangle.getFirstStoron());
    }


    @org.junit.jupiter.api.Test
    void getSecondStoron() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(4, triangle.getSecondStoron());
    }


    @org.junit.jupiter.api.Test
    void getThidStoron() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(5, triangle.getThidStoron());
    }


}