public class Actor extends Person {
    private int height;

    public Actor(Gender gender, String name, String surname, int height) {
        super(gender, name, surname);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + height;
        return result;
    }
}
