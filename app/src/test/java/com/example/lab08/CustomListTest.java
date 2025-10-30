package com.example.lab08;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        assertFalse(list.hasCity(calgary));

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));

        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteCityThrowsWhenMissing() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");

        list.deleteCity(vancouver);
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());

        City calgary = new City("Calgary", "AB");
        City toronto = new City("Toronto", "ON");

        list.addCity(calgary);
        list.addCity(toronto);
        assertEquals(2, list.countCities());

        list.addCity(calgary);
        assertEquals(2, list.countCities());
    }
}
