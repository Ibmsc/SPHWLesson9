import java.util.Objects;

public class Author {
    private final String firstNameAuthor;
    private final String surnameAuthor;

    public Author(String name,String surname) {

        this.firstNameAuthor = name;
        this.surnameAuthor = surname;
    }
    public String getFirstNameAuthor(){
        return this.firstNameAuthor;
    }
    public String getSurnameAuthor(){
        return this.surnameAuthor;
    }
    @Override
    public String toString(){
        return "Имя Автора: " + getFirstNameAuthor()  + getSurnameAuthor() + "; ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor, author.firstNameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, surnameAuthor);
    }
}
