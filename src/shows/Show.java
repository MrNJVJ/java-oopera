package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;   // мин
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(Director director, int duration, ArrayList<Actor> listOfActors, String title) {
        this.director = director;
        this.duration = duration;
        this.listOfActors = listOfActors;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printActors() {
        if (listOfActors == null) {
            System.out.println("Ошибка, список актёров: null");
            return;
        }
        String out = "Список актёров:";
        for (int i = 0; i < listOfActors.size(); i++) {
            if (i > 0) {
                out += ", ";
            }
            out += listOfActors.get(i).toString();
        }
        System.out.println(out);
    }

    public boolean containsActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.toString() + " уже участвует в спектакле!");
            return true;
        }
        return false;
    }

    public void addActor(Actor actor) {
        if (containsActor(actor)) {
            return;
        }
        listOfActors.add(actor);
    }

    public void swapActor(Actor actor, String surname) {
        if (containsActor(actor)) {
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equalsIgnoreCase(surname)) {
                // Нашли, меняем
                System.out.println("Замена актёра " + listOfActors.get(i).toString() + " на " + actor.toString());
                listOfActors.set(i, actor);
                return;
            }
        }
        // Такого актёра нет
        System.out.println("Актёр с фамилией " + surname + " не участвует в спектакле, замена невозможна");
    }
}
