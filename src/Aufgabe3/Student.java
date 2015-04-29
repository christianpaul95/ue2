
package Aufgabe3;


public class Student extends Mensch //vererbung
{
    int matrikelnummer; //eigenschaften anlegen
    String studiengang;
    public Student(int matrikelnummer, String studiengang, String vorname, String nachname, int Alter) //konstruktor
    {
        super(vorname, nachname, Alter); //look at the other comments
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public void Status() //ebenfalls bereits kommentiert
    {
        System.out.println("Der student " + vorname + " " + nachname + " studiert " + studiengang + " und hat PKZ " + matrikelnummer);
    }
    
}
