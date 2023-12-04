package ru.netology.dz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmManagerTest {
    FilmManager manager = new FilmManager();

    FilmItems film1 = new FilmItems(1, "Бладшот", "боевик", "постер");
    FilmItems film2 = new FilmItems(2, "Вперёд", "мультфильм", "постер");
    FilmItems film3 = new FilmItems(3, "Отель (Белград)", "комедия", "постер");
    FilmItems film4 = new FilmItems(4, "Джентельмены", "боевик", "постер");
    FilmItems film5 = new FilmItems(5, "Человек- невидимка", "ужасы", "постер");
    FilmItems film6 = new FilmItems(6, "Тролли. Мировой тур", "мультфильм", "постер");
    FilmItems film7 = new FilmItems(7, "Номер один", "комедия", "постер");


    @Test
    public void allFilms() {
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);


        FilmItems[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmItems[] actual = manager.allFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm() {
        manager.addFilms(film2);

        FilmItems[] expected = {film2};
        FilmItems[] actual = manager.allFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilm() {
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);
        manager.addFilms(film7);

        FilmItems[] expected = {film7, film6, film5, film4, film3};
        FilmItems[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimit() {

        manager.getLimit();

        int expected = 5;
        int actual = manager.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FilmsUnderLimit() {
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);

        FilmItems[] expected = {film3, film2, film1};
        FilmItems[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FilmsAboveLimit() {
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);
        manager.addFilms(film6);

        FilmItems[] expected = {film6, film5, film4,film3, film2};
        FilmItems[] actual = manager.lastFilm();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FilmsInLimit() {
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        manager.addFilms(film4);
        manager.addFilms(film5);

        FilmItems[] expected = {film5, film4,film3, film2, film1};
        FilmItems[] actual = manager.lastFilm();

    }
}
