package pkg1410653944_u2;


public class Mensch extends Saeugetier
{
    public static void main(String[] args) 
    {
        Mensch m1 = new Mensch("Chris",19,"male");
        System.out.println(m1.toString());
        
    }

    public Mensch(String name, int alter, String Geschlecht) 
    {
        super(name, alter, Geschlecht);
    }

    @Override
    public String toString() 
    {
        return name + " # " + alter + " # " + geschlecht; 
    }
    
    
}
