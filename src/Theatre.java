import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor(Gender.MALE, "Иван", "Иванов", 175);
        Actor actor2 = new Actor(Gender.MALE, "Андрей", "Поляков", 180);
        Actor actor3 = new Actor(Gender.FEMALE, "Дарья", "Петрова", 160);

        Director director1 = new Director(Gender.MALE, "Евгений", "Гениальнов", 0);
        Director director2 = new Director(Gender.FEMALE, "Екатерина", "Крюкова", 11);

        Person musicAuthor = new Person(Gender.MALE, "Хироюки", "Савано");
        Person choreographer = new Person(Gender.FEMALE, "Наталья", "Андреева");

        Show show = new Show(director1, 123, new ArrayList<Actor>(), "Шоу");
        Opera opera = new Opera(director2, 100, new ArrayList<Actor>(), "Опера", "Либретто оперы", musicAuthor, 10);
        Ballet ballet = new Ballet(director1, 110, new ArrayList<Actor>(), "Балет", "Либретто балета", musicAuthor, choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        // Тест повторного добавления
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        System.out.println(show.getTitle() + ":");
        show.printActors();
        System.out.println(opera.getTitle() + ":");
        opera.printActors();
        System.out.println(ballet.getTitle() + ":");
        ballet.printActors();

        System.out.println("-".repeat(20));

        opera.swapActor(actor2, actor3.getSurname());
        opera.printActors();

        System.out.println("-".repeat(20));
        // Замена несущестующего актёра
        opera.swapActor(actor3, "Тестовый");
        opera.printActors();
        // Замена на актёра, который уже участвует
        opera.swapActor(actor1, actor2.getSurname());
        opera.printActors();

        System.out.println("-".repeat(20));
        opera.printLibretto();
        ballet.printLibretto();
    }
}
