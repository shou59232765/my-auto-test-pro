package com.param;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestParam {

    //    适合简单的参数化
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testWithValueSource(int args) {
        assertTrue(args > 0 && args < 4);
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {" ", "  ", "\t", "\n"})
    void testNullEmptyAndBlankString(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    //外部方法提供测试数据，来达到参数胡
    @ParameterizedTest
    @MethodSource("getTestData")
    void testCasesWithMethodSource(String fruit) {
        assertNotNull(fruit);
    }

    static Stream<String> getTestData() {
        return Stream.of("apple", "banner");
    }

    //复杂类型的参数化
    @ParameterizedTest
    @MethodSource("getTestData1")
    void testCasesWithMethodSource1(String fruit, double price, List<String> list) {
        assertEquals(5, fruit.length());
        assertTrue(price >= 1 && price < 4);
    }

    static Stream<Arguments> getTestData1() {
        return Stream.of(
                Arguments.arguments("apply", 2.00, Arrays.asList("a", "b")),
                Arguments.arguments("banner", 1.50, Arrays.asList("c", "d")),
                Arguments.arguments("lemon", 3.00, Arrays.asList("e", "f"))
        );
    }



    @ParameterizedTest
    @ArgumentsSource(MyArgumentProvide.class)
    void testCasesWithMethodSource2(String argment) {
        assertNotNull(argment);
    }

    class MyArgumentProvide implements ArgumentsProvider{

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of("apple","banner","lemon").map(Arguments::of);
        }
    }


}
