package Objects_and_classes;

public class Book {
    String title;
    Author writer;
    private int age;
    public Book (String name, Author writer,int age) {
        this.title = name;
        this.writer = writer;
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }
    public Author getWriter () {
        return this.writer;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
