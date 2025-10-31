package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void hasCity_returnsTrueWhenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void hasCity_returnsFalseWhenAbsent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void deleteCity_removesExistingCity() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        list.deleteCity(vancouver);
        assertFalse(list.hasCity(vancouver));
        assertEquals(0, list.countCities());
    }

    @Test
    public void deleteCity_throwsIfMissing() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");
        assertThrows(IllegalArgumentException.class, () -> list.deleteCity(toronto));
    }

    @Test
    public void countCities_returnsSize() {
        CustomList list = new CustomList();
        list.addCity(new City("Winnipeg", "MB"));
        list.addCity(new City("Halifax", "NS"));
        assertEquals(2, list.countCities());
    }
}
