package Aufgabe4;

import Aufgabe4.Auto.colour; //sodass colour.black usw funktionieren
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Aufruf 
{
    public static void main(String[] args) 
    {
        Auto bmw = new Auto((short) 5, (short) 5, colour.black, (short) 260, (short) 3); //objekte instanziert
        Auto audi = new Auto((short) 4, (short) 5, colour.blue, (short) 150, (short) 5);
        Auto mercedes = new Auto((short) 8, (short) 5, colour.red, (short) 180, (short) 5);
        Auto nissan = new Auto((short) 2, (short) 5, colour.silver, (short) 280, (short) 5);
        Auto porsche = new Auto((short) 12, (short) 5, colour.white, (short) 300, (short) 3);
    
        List<Auto> liste = new ArrayList<Auto>(); //arrayliste erstellt vom typ auto
        liste.add(bmw); //die objekte zur liste geaddet
        liste.add(audi);
        liste.add(mercedes);
        liste.add(nissan);
        liste.add(porsche);
        
        Collections.sort(liste); //JUULIIANN??
        for(Auto a : liste) //for each schleife, also fuer jedes Auto a in der liste
        {
            System.out.println(a.getPS()); //soll fuer jedes Auto (a) die PS ausgeben
        }

    }
        
}
