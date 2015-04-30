package pkg1410653944_u2;


public class Mensch extends Saeugetier //extends bedeutet vererbung, mensch erbt von saeugetier
{
    public static void main(String[] args) 
    {
        Mensch m1 = new Mensch("Chris",19,"male"); //objekt instanziert
        System.out.println(m1.toString()); //das objekt m1 mit hilfe von einer toString methode ausgeben lassen
        
    }

    public Mensch(String name, int alter, String Geschlecht) //konstruktor
    {
        super(name, alter, Geschlecht); //zugriff auf elemente der basisklasse, praefix benoetigt so dass er zugreifen kann
    }                                   //super = uebergabe vom konstruktor vom saeugetier, dass ers mitnimmt

    @Override
    public String toString() //toStringmethode fuers ausgeben
    {
        return name + " # " + alter + " # " + geschlecht; 
    }
    
    
}
