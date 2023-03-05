package com.example.ec2prac.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class ControllerTest {

    @Test
    public void testPractice() {
        Controller controller = mock(Controller.class);
        when(controller.practice()).thenReturn("연습입니다.");
        String result = controller.practice();
        assertEquals("연습입니다.", result);
    }
}