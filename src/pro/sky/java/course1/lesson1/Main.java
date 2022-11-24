package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {

        Author lermontov = new Author("Михаил", "Лермонтов");
        Author garrison = new Author("Гарри", "Гаррисон");

        Book maskarad = new Book("Маскарад", lermontov, 2002);
        Book stalnaiakrisa = new Book("Стальная крыса", garrison, 1961);

        System.out.println("(Книга) " + maskarad.getBookName() + ", " + maskarad.getAutorName() + " " +
                maskarad.getAutorLastName() + " " + maskarad.getYearOfPublication() + " г.");
        System.out.println("(Книга) " + stalnaiakrisa.getBookName() + ", " + stalnaiakrisa.getAutorName() + " " +
                stalnaiakrisa.getAutorLastName() + " " + stalnaiakrisa.getYearOfPublication() + " г.");

        stalnaiakrisa.setYearOfPublication(1957);

        System.out.println("(Книга) " + stalnaiakrisa.getBookName() + ", " + stalnaiakrisa.getAutorName() + " " +
                stalnaiakrisa.getAutorLastName() + " " + stalnaiakrisa.getYearOfPublication() + " г.");
    }
}
