package com.example.lab08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {

    private final List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public CustomList(List<City> initial) {
        if (initial == null) {
            this.cities = new ArrayList<>();
        } else {
            this.cities = new ArrayList<>(initial);
        }
    }

    public void addCity(City city) {
        if (city == null) {
            throw new IllegalArgumentException("city must not be null");
        }
        if (!cities.contains(city)) {
            cities.add(city);
        }
    }

    public boolean hasCity(City city) {
        if (city == null) {
            return false;
        }
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found");
        }
        cities.remove(city);
    }

    public int countCities() {
        return cities.size();
    }

    public List<City> getCities() {
        return Collections.unmodifiableList(new ArrayList<>(cities));
    }
}
