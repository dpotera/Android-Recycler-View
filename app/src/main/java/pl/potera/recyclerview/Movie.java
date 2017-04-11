package pl.potera.recyclerview;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private String title;
    private String genre;
    private String year;

    public Movie() { }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
}