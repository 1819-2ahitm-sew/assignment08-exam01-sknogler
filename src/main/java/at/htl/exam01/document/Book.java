package at.htl.exam01.document;

public class Book extends Document {

    private String titel;

    public Book(String author, String titel) {
        super(author);

        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return "Book: " + titel + " von " + getAuthor();
    }
}
