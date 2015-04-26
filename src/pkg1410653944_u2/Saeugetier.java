package pkg1410653944_u2;

public class Saeugetier 
{

    String name;
    int alter;
    String geschlecht;
    public static void main(String[] args) 
    {
        
    }

    public Saeugetier(String name, int alter, String Geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = Geschlecht;
    }
    
    public String printAll()
    {
        return name + alter + geschlecht;
    }
    
}
