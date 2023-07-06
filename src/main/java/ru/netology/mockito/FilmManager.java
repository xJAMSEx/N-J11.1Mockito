package ru.netology.mockito;

public class FilmManager {
    private FilmManager[] movies;
    private int limit;

    public FilmManager() {
        this.limit = 5;
        this.movies = new FilmManager[0];
    }

    public FilmManager(int limit) {
        this.limit = limit;
        this.movies = new FilmManager[0];
    }

    public void add(FilmManager item) {
        FilmManager[] tmp = new FilmManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = item;
        movies = tmp;
    }

    public FilmManager[] findAll() {
        return movies;
    }

    public FilmManager[] findLast() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        FilmManager[] result = new FilmManager[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}