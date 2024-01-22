package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void test() {
        ReverseString rs = new ReverseString();
        assertEquals("gnirtSesreveR", rs.reverseString("ReverseString"));
    }
}