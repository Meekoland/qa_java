package com.example.tests;

import com.example.AlexLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensShouldReturnZero() throws Exception {

        AlexLion alex = new AlexLion(feline);
        int actualResult = alex.getKittens();
        assertEquals("Некорректный результат вызова метода", 0, actualResult);
    }

    @Test
    public void getFriendsShouldReturnFriendList() throws Exception {

        AlexLion alex = new AlexLion(feline);
        List<String> expectedResult = List.of("Глория", "Мелман", "Марти");
        List<String> actualResult = alex.getFriends();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getPlaceOfLivingShouldReturnZoo() throws Exception {

        AlexLion alex = new AlexLion(feline);
        String expectedResult = "Нью-Йоркский зоопарк";
        String actualResult = alex.getPlaceOfLiving();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void constructorAlexHasManeIsTrue() throws Exception {

        AlexLion alex = new AlexLion(feline);
        boolean actualResult = alex.doesHaveMane();
        assertTrue("Некорректое значение свойства", actualResult);
    }
}