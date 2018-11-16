package at.htl.exam01.document;

public class Email extends Document{
    private static String to;

    public Email(String to){
        super(author);
        this.to= to;
    }
    public Email(){
    }

    @Override
    public String toString() {
        String string = "Email: "+ to + ", "+ subject;
        return string;
    }

    //region GETTER AND SETTER

    public static String getTo() {
        return to;
    }
    public static void setTo(String to) {
        Email.to = to;
    }

    //endregion
}
