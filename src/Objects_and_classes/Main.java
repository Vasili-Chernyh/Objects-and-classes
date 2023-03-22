package Objects_and_classes;
public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author fedorDostoevsky = new Author("Федор","Достоевкий");
        Book warAndPeace = new Book("Война и Мир", levTolstoi, 1866);
        Book crimeAndPunishment = new Book("Преступление и наказание", fedorDostoevsky, 1867);
        warAndPeace.setAge(1867);
        //System.out.println("warAndPeace.name = " + warAndPeace.getTitle());
        //System.out.println("warAndPeace.age = " + warAndPeace.getAge());
        //System.out.println("levTolstoi.surname = " + levTolstoi.getSurname());
        //System.out.println("levTolstoi.name = " + levTolstoi.getName());
        //System.out.println("warAndPeace.writer = " + warAndPeace.getWriter());
        //System.out.println("crimeAndPunishment.getTitle() = " + crimeAndPunishment.getTitle());
        //System.out.println("crimeAndPunishment.getAge() = " + crimeAndPunishment.getAge());
        //System.out.println("fedorDostoevsky.getName() = " + fedorDostoevsky.getName());
        //System.out.println("fedorDostoevsky.getSurname() = " + fedorDostoevsky.getSurname());
        //System.out.println("crimeAndPunishment.getWriter() = " + crimeAndPunishment.getWriter());
        System.out.println(fedorDostoevsky);
        System.out.println(crimeAndPunishment);
        System.out.println(levTolstoi);
        System.out.println(warAndPeace);
    }
}
