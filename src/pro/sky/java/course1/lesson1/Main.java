package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {

        Author lermontov = new Author("Михаил", "Лермонтов");
        Author garrison = new Author("Гарри", "Гаррисон");
        Author garrison2 = new Author("Гарри", "Гаррисон");

        Book maskarad = new Book("Маскарад", lermontov, 2002);
        Book stalnaiakrisa = new Book("Стальная крыса", garrison, 1961);

        System.out.println("(Книга) " + maskarad.getBookName() + ", " + maskarad.getAutorName() + " " +
                maskarad.getAutorLastName() + " " + maskarad.getYearOfPublication() + " г.");
        System.out.println("(Книга) " + stalnaiakrisa.getBookName() + ", " + stalnaiakrisa.getAutorName() + " " +
                stalnaiakrisa.getAutorLastName() + " " + stalnaiakrisa.getYearOfPublication() + " г.");

        stalnaiakrisa.setYearOfPublication(1957);

        System.out.println("(Книга) " + stalnaiakrisa.getBookName() + ", " + stalnaiakrisa.getAutorName() + " " +
                stalnaiakrisa.getAutorLastName() + " " + stalnaiakrisa.getYearOfPublication() + " г.");

        System.out.println(garrison.toString());
        System.out.println(stalnaiakrisa);
        System.out.println(garrison == garrison2);
        System.out.println(garrison.equals(garrison2));
        System.out.println(garrison.hashCode());
        System.out.println(garrison2.hashCode());
        System.out.println(maskarad.hashCode());
        System.out.println(stalnaiakrisa.hashCode());

    }

}
