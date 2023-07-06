package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmManager manager = new FilmManager(3);
    FilmManager film1 = new FilmManager();
    FilmManager film2 = new FilmManager();
    FilmManager film3 = new FilmManager();
    FilmManager film4 = new FilmManager();
    FilmManager film5 = new FilmManager();
    FilmManager film6 = new FilmManager();
    FilmManager film7 = new FilmManager();
    FilmManager film8 = new FilmManager();

    @Test
    public void FindAllTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        FilmManager[] expected = {film1, film2, film3};
        FilmManager[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        FilmManager[] expected = {film3, film2, film1};
        FilmManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        FilmManager[] expected = {film8, film7, film6};
        FilmManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastLimit() {
        FilmManager manager = new FilmManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);


        FilmManager[] expected = {film8, film7, film6, film5, film4};
        FilmManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void IfLimitGreaterArray() {
        manager.add(film1);
        manager.add(film2);


        FilmManager[] expected = {film2, film1};
        FilmManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}