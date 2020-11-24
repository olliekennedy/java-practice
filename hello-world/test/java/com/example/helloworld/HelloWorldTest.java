package com.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

//    @Test
//    void main() {
//        assertEquals("Hello, World!", HelloWorld.main());
//    }


    @Test
    void name() {
        assertEquals("hello world", HelloWorld.main());
    }
}