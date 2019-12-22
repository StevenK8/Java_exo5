package app3.java.geometrie;

import java.awt.Color;
import java.awt.Point;

public abstract class Forme {
    private Point centre;
    private Color couleur;

    public void translation(int x, int y){
        centre.x += x;
        centre.y += y;
    }

    public String toString(){
        return "[ centre de gravité : x ="+centre.x+" , y ="+centre.y+"]\n"+
        "[ couleur : r ="+couleur.getRed()+" , g ="+couleur.getGreen()+" , b ="+couleur.getBlue()+"]";
    }

    /*
    [ centre de gravité : x =10 , y =4]
    [ rayon : 20]
    [ couleur : r =82 , g =255 , b =0]
    */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
    }
}