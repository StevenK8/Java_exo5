package app3.java.geometrie;

import java.awt.Color;
import java.awt.Point;

public final class Carre extends Rectangle{
    private int longueur;

    public Carre(Point centre, Color couleur, int longueur){
        super(centre, couleur, longueur, longueur);
        this.longueur = longueur;
    }

    public String toString(){
        return super.toString();
    }
}