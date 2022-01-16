package org.java.annotation;

import org.TestId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnnotationTest {


    @Test
    @TestId("ANNOTATION-0001")
    public void test() {
        System.out.println(FirstLayer.class.isAnnotationPresent(Qualifier.class));
        System.out.println(SecondLayer.class.isAnnotationPresent(Qualifier.class));
    }
}
