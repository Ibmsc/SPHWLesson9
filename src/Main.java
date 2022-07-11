public class Main {
    public static void main(String[] args) {
        System.out.println();
        Author authorTolstoy = new Author("Лев ","Толстой");
        Book bookWarAndPeace = new Book("Война и мир", 2014, authorTolstoy);

        Author authorPyshkin = new Author("Александр ", "Пушкин");
        Book bookSkazki = new Book(("Сказки"), 1999, authorPyshkin);

        System.out.println("Книга №1 - " + bookWarAndPeace.getName() + "; Год издания - " + bookWarAndPeace.getYear()+
                "; Автор книги - " + bookWarAndPeace.getAuthor().getFirstNameAuthor() + " " + bookWarAndPeace.getAuthor().getSurnameAuthor()+".");

        System.out.println();
        System.out.println("Книга №2 - " + bookSkazki.getName()+ "; Год издания - " + bookSkazki.getYear()+
                "; Автор книги - " + bookSkazki.getAuthor().getFirstNameAuthor() + " " + bookSkazki.getAuthor().getSurnameAuthor() + ".");
        System.out.println();

        bookWarAndPeace.setYear(2016);
        System.out.println("Книга №1 - " + bookWarAndPeace.getName() + "; Год издания - " + bookWarAndPeace.getYear()+
                "; Автор книги - " + bookWarAndPeace.getAuthor().getFirstNameAuthor() + " " + bookWarAndPeace.getAuthor().getSurnameAuthor()+".");
        System.out.println();
        System.out.println("-----Метод 'toString'-----");
        System.out.println();

        Author authorGogol = new Author("Николай ", "Гоголь ");
        System.out.println(authorGogol);

        Book bookDeadSouls = new Book("Мертвые души ", 2020, authorGogol);
        System.out.println(bookDeadSouls);

        System.out.println();
        System.out.println("-----Метод 'hashCode'-----");
        System.out.println();

        System.out.println("Гоголь hash: " + authorGogol.hashCode());
        System.out.println("Пушкин hash: " + authorPyshkin.hashCode());
        System.out.println("Толстой hash: " + authorTolstoy.hashCode());

        System.out.println();
        System.out.println("-----Метод 'equals'-----");
        System.out.println();

        System.out.println(authorGogol.equals(authorPyshkin));
        System.out.println(authorPyshkin.equals(authorPyshkin));
        System.out.println(bookDeadSouls.equals(bookSkazki));
        System.out.println((bookDeadSouls.equals(bookDeadSouls)));
    }
}