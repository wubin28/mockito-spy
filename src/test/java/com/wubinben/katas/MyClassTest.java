package com.wubinben.katas;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MyClassTest {
    @Test
    public void should() {
        MyClass spiedMyClass = spy(new MyClass());

        // would work fine
        doReturn("test").when(spiedMyClass).anotherMethodInClass();

        // would throw a NullPointerException
        when(spiedMyClass.anotherMethodInClass()).thenReturn("test");
    }
}