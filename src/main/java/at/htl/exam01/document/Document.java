package at.htl.exam01.document;

public abstract class Document {
    public static String author;

    public Document(String author){
        this.author = author;
    }
    public Document(){
    }

    public String toString() {
        return toString();
    }

    //region GETTER AND SETTER

    public static String getAuthor() {
        return author;
    }
    public static void setAuthor(String author) {
        Document.author = author;
    }

    //endregion
}
