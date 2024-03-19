package ru.blinov.hw2;

import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Запускаю прогон");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Прогон завершен");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Запускаю тест");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Тест завершен");
    }

    @Test
    void firstTest(){
        System.out.println("            Первый тест");
        Assertions.assertTrue(4*4 == 16);
    }

    @Test
    void secondTest(){
        System.out.println("            Второй тест");
        Assertions.assertTrue(5*5 == 25);
    }
}
