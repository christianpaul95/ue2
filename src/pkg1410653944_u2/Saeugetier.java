package pkg1410653944_u2;

public class Saeugetier 
{

    String name; //attribute anlegen
    int alter;
    String geschlecht;
    public static void main(String[] args) 
    {
        
    }

    public Saeugetier(String name, int alter, String Geschlecht) 
    {
        this.name = name; 
        this.alter = alter; //muss man machen, dass der computer den unterschied weis
        this.geschlecht = Geschlecht;
    }
    
    public String printAll()  //voellig unnoetig..
    {
        return name + alter + geschlecht;
    }
    
}
