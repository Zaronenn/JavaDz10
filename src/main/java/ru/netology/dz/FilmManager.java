package ru.netology.dz;
public class FilmManager {

    private FilmItems[] films = new FilmItems[0];
    private int limit;

    public FilmManager() {

        this.limit = 5;
    }

    public int getLimit() {
        return limit;
    }

    public void addFilms(FilmItems film) {
        FilmItems[] tmp = new FilmItems[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmItems[] allFilms() {
        return films;

    }


    public FilmItems[] lastFilm() {
        int resultlenth;

        if (films.length < limit) {
            resultlenth = films.length;
        } else {
            resultlenth = limit;
        }
        FilmItems[] tmp = new FilmItems[resultlenth];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}
