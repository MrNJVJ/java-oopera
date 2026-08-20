package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(Director director, int duration, ArrayList<Actor> listOfActors, String title,
                       String librettoText, Person musicAuthor) {
        super(director, duration, listOfActors, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
