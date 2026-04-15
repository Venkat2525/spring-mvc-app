package com.spring.mvc.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FirstApplicationTest {

    @Test
    void testGetHomeData() {

        FirstApplication controller = mock(FirstApplication.class);

        when(controller.getHomeData()).thenReturn("welcome");

        String result = controller.getHomeData();

        assertEquals("welcome", result);
    }
}