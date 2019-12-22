package app3.java.geometrie;

import java.awt.Color;
import java.awt.Point;

public class Cercle extends Forme{
    private int rayon;

    public Cercle(Point centre, Color couleur, int rayon){
        super(centre, couleur);
        this.rayon = rayon;
    }

    public String toString(){
        return "[ Cercle \n"+super.toString() + "\t[ rayon : "+rayon+"]\n]\n";
    }
}