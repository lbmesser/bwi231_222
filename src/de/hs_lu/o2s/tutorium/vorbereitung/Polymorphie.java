/**
 * 
 */
package de.hs_lu.o2s.tutorium.vorbereitung;

/**
 * @author christianwalter
 *
 * @since 03.11.2021
 */
public class Polymorphie {
	
    public Polymorphie() { 
        Tier[] tiere = { new Vogel(), new Wurm() }; 
        for (int i = 0; i < tiere.length; i++) { 
            tiere[i].bewegtSich(); 
            tiere[i].zwitscher();   // Fehler 
            tiere[i].frisst();      // Fehler 
        } 
    } 

    public static void main(String[] args) { 
        new Polymorphie(); 
    } 

}



class Tier { 
    void bewegtSich() { 
        System.out.println("Schwimmen, laufen, kriechen, hüpfen oder fliegen?"); 
    } 
} 

class Vogel extends Tier { 
    @Override 
    void bewegtSich() { 
        System.out.println("Ich fliege"); 
    } 
     
    void zwitscher() { 
        System.out.println("tirilli"); 
    } 
     
    void frisst() { 
        System.out.println(getClass() + " frisst"); 
    } 
} 

class Wurm extends Tier { 
    @Override 
    void bewegtSich() { 
        System.out.println("Ich krieche"); 
    } 
     
    void frisst() { 
        System.out.println(getClass() + " frisst"); 
    } 
} 