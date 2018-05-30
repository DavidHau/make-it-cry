package com.cry.it.make.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class FaceTest {

    @Test
    public void should_smile() throws Exception {
//        assertThat(new Face().face(), is("smile"));
        Face face = mock(Face.class);
        when(face.face()).thenReturn("smile");

        assertThat(face.face(), is("smile"));
    }

    @Test(timeout = 10)
    public void should_cry() throws Exception {
        assertThat(new Face().face(), is("cry"));
    }
}