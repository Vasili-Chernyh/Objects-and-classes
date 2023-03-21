package Objects_and_classes;

public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    public String toString () {
        return "Имя автора: " + this.name + ". Фамилия автора: " + this.surname;
    }
}
