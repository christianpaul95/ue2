package Aufgabe4;


public class Fahrzeug implements Comparable //JULLIAANANN
{
    private short Reifen;
    private String Farbe;
    private short PS;       
    private short Tueren; 
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl; //JULLIAANN
    
    void starten()
    {
        this.Gestartet = true;
    }
    
    void stoppen()
    {
        this.Gestartet = false;
    }

    public Fahrzeug(short Reifen, short PS, short Tueren) //konstruktor
    {
        this.Reifen = Reifen;
        //this.Farbe = Farbe;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        this.Geschwindigkeit = 0;
        Anzahl++; //bei jeder benutzung um 1 erhoehen
    }
            
    void beschleunigen(short Geschwindigkeit)
    {
        if(this.Gestartet = true && this.Geschwindigkeit + Geschwindigkeit <= 250)
        {
            this.Geschwindigkeit += Geschwindigkeit;
        }
        else if(this.Gestartet = true && this.Geschwindigkeit + Geschwindigkeit > 250)
        {
            this.Geschwindigkeit = 250;
        }
    }
    
    void bremsen(short Geschwindigkeit)
    {
        if(this.Gestartet = true && this.Geschwindigkeit + Geschwindigkeit >= 0)
        {
            this.Geschwindigkeit -= Geschwindigkeit;
        }
        else if(this.Gestartet = true && this.Geschwindigkeit + Geschwindigkeit < 0)
        {
            this.Geschwindigkeit = 0;
        }
    }

    public short getReifen() 
    {
        return Reifen;
    }

    public void setReifen(short Reifen)
    {
        this.Reifen = Reifen;
    }

    public short getPS()
    {
        return PS;
    }

    public void setPS(short PS) 
    {
        this.PS = PS;
    }

    public short getTueren() 
    {
        return Tueren;
    }

    public void setTueren(short Tueren) 
    {
        this.Tueren = Tueren;
    }

    public boolean isGestartet() 
    {
        return Gestartet;
    }

    public void setGestartet(boolean Gestartet)
    {
        this.Gestartet = Gestartet;
    }

    public short getGeschwindigkeit() 
    {
        return Geschwindigkeit;
    }

    public void setGeschwindigkeit(short Geschwindigkeit)
    {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static int getAnzahl() 
    {
        return Anzahl;
    }

    public static void setAnzahl(int Anzahl)
    {
        Fahrzeug.Anzahl = Anzahl;
      
    }

    @Override
    public int compareTo(Object o) //da darf man kein Fahrzeug f reinschreiben, dann wuerde man es nicht mehr ueberschreiben, und dann isses kein compareTo mehr
    {
        final Fahrzeug f = (Fahrzeug) o; //das o ist jetz ein Fahzeug und heisst f //casting
        if(this.getPS() > f.getPS())
        {
            return -1;
        }
        else if(this.getPS() == f.getPS())  //JULLIAANN! wieso auch final?
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
}
