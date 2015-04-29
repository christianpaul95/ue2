package Aufgabe3;


public class Mensch 
{
    String vorname; //attribute erstellen
    String nachname; 
    int Alter;
    
    public static void main(String[] args) 
    {
        Mensch m1 = new Mensch("Chris","Paul", 19); //objekt instanzieren
        m1.Status(); //soll den das objekt m1 in die status methode einfuegen sozusagen
        Student s1 = new Student(1410653944, "Web", "Walter", "Mayer", 21); //student objekt instanziert
        s1.Status();
    }
    public Mensch(String vorname, String nachname, int Alter) //konstruktor
    {                                                         //konstruktor soll die eigenschaften auf einen definierten wert setzen
        this.vorname = vorname;                               //konstruktor wird aufgerufen bei der instanzierung eines objekts
        this.nachname = nachname;                             //konstruktor ist eine methode on rueckgabewert
        this.Alter = Alter;
    }
    
    public void Status() //status methode, welche dann benutzt wird beim aufrufen als schablone sozusagen
    {
        System.out.println("Es handelt sich um einen Mensch!");   
        System.out.println("Vorname:" + vorname + " Nachname:" + nachname + " Alter:" + Alter);
    }
    
}
