package at.htl.exam01.document;

public class Book extends Document {

    private static String title;

    public Book(String title){
        super(author);
        this.title = title;
    }
    public Book(){
    }

    @Override
    public String toString() {
        String string = "Book: "+ author + ", "+ title;
        return string;
    }

    //region GETTER AND SETTER

    public static String getTitle() {
        return title;
    }
    public static void setTitle(String title) {
        Book.title = title;
    }

    //endregion
}
