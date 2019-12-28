package app3.java.geometrie;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Forme{
    private int largeur, hauteur;

    public Rectangle(Point centre, Color couleur, int largeur, int hauteur){
        super(centre, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String toString(){
        if(largeur == hauteur){
            return "[ Carré \n"+super.toString() + "\t[ longueur des côtés : "+largeur+" ]\n]\n";
        }
        return "[ Rectangle \n"+super.toString() + "\t[ largeur : "+largeur+" , hauteur : "+hauteur+" ]\n]\n";
    }
}