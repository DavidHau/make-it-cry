package com.cry.it.make.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import static org.powermock.api.support.membermodification.MemberModifier.stub;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Face.class})
public class FaceTest {
    @Before
    public void setup() {
        stub(method(Face.class, "getName")).toReturn("asd");
    }

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

    @Test
    public void should_static_method_modified() throws Exception {
        assertThat(Face.getName(), is("asd"));
    }
}