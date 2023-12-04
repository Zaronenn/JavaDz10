package ru.netology.dz;
public class FilmItems {

    private int filmId; // айди фильма
    private String filmName; // название фильма
    private String genre; // жанр
    private String poster; // постер

    public FilmItems(int filmId, String filmName, String genre, String poster) {

        this.filmId = filmId;
        this.filmName = filmName;
        this.genre = genre;
        this.poster = poster;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getGenre() {
        return genre;
    }

    public String getPoster() {
        return poster;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
