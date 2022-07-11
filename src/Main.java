public class Main {
    public static void main(String[] args) {

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
    }
}