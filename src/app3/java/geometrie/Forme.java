package app3.java.geometrie;

import java.awt.Color;
import java.awt.Point;

public abstract class Forme {
    private Point centre;
    private Color couleur;

    public Forme(Point centre, Color couleur){
        this.centre = centre;
        this.couleur = couleur;
    }

    public void translation(int x, int y){
        centre.x += x;
        centre.y += y;
    }

    public String toString(){
        return "\t[ centre de gravité : x ="+centre.x+" , y ="+centre.y+"]\n"+
        "\t[ couleur : r ="+couleur.getRed()+" , g ="+couleur.getGreen()+" , b ="+couleur.getBlue()+"]\n";
    }
}