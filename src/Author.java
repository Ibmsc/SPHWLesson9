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

}
