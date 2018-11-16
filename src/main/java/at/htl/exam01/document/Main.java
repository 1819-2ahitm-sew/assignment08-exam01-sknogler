package at.htl.exam01.document;

import java.util.Scanner;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */
    public static void main(String[] args) {

        String[] strings = new String[1000];

        strings[i] = readBook(strings);
        readEmail(strings);

    }

    public static void readBook(String[] strings){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buch ");
        System.out.println("=====");
        System.out.printf("Name des Buches: ");
        Book.setTitle(scanner.next());
        System.out.printf("Name des Authors: ");
        Book.setAuthor(scanner.next());
    }

    public static void readEmail(String[] strings){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");
        System.out.println("=======");
        System.out.printf("Name des Empfängers: ");
        Email.setTo(scanner.next());
        System.out.printf("Betreff: ");
        Email.setSubject(scanner.next());
    }

}
