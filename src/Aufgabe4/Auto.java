package Aufgabe4;


public class Auto extends Fahrzeug //vererbung
{
    private boolean Klimaanlage;
    private short Airbags;
    private colour Farbe; //enum colour
    
    public enum colour //enum
    {
        silver, red, black, blue, white; //wertebereich von colour
    }

    @Override
    public String toString() 
    {
        return "Mein Auto hat " + getPS() + " PS und fahrt mit " + getGeschwindigkeit() + "km/h";
    }

    public Auto(short Airbags, short Reifen, colour Farbe, short PS, short Tueren) //konstruktor
    {
        super(Reifen, PS, Tueren);
        Klimaanlage = false;
        this.Airbags = Airbags;
        this.Farbe = colour.blue; //hier setz ich die standard farbe fest
        
    }

    public boolean isKlimaanlage() 
    {
        return Klimaanlage;
    }

    public colour getFarbe() 
    {
        return Farbe;
    }

    public void setFarbe(colour Farbe) 
    {
        this.Farbe = Farbe;
    }

    public void setKlimaanlage(boolean Klimaanlage) 
    {
        this.Klimaanlage = Klimaanlage;
    }

    public short getAirbags() 
    {
        return Airbags;
    }

    public void setAirbags(short Airbags) 
    {
        this.Airbags = Airbags;
    }
    
    void KlimaanlageAn()  
    {
        if(this.Klimaanlage = true)
        {
            
            System.out.println("Klimaanlage ist schon an");
        }
        else 
        {
            this.Klimaanlage = true;
        }
    }
    
    void KlimaanlageAus()
    {
        if(this.Klimaanlage = false)
        {
            System.out.println("Klimaanlage ist schon aus!");
        }
        else
        {
            
            this.Klimaanlage = false;
        }
    }
    
}
