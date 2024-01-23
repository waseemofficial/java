package com.example;

import org.junit.Test;
////import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    ReverseString rs = new ReverseString();

    @Test
    public void test() {
        assertEquals("gnirtSesreveR", rs.reverseString("ReverseString"));
    }

    @Test
    public void test2() {
        assertEquals("avaJ", rs.reverseString("Java"));
    }

    @Test
    public void test3() {
        assertEquals("egaugnal gnimmargorp a si avaJ", rs.reverseString("Java is a programming language"));
    }
}