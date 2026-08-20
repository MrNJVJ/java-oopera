package shows;

import persons.Actor;
import persons.Director;
import persons.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(Director director, int duration, ArrayList<Actor> listOfActors, String title, String librettoText,
                 Person musicAuthor, int choirSize) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
