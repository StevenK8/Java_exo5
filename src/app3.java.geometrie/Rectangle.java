package app3.java.geometrie;

public class Rectangle extends Forme{
    private int largeur, hauteur;

    public Rectangle(Point centre, Color couleur, int largeur, int hauteur){
        super(centre, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
}