package app3.java.geometrie;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Point;

public class Test{

    public static void main(String[] args) {
        // ArrayList<Forme> listeFormes = new ArrayList<Forme>();
        // listeFormes.add(new Cercle(new Point(10,10), new Color(112,63,2),15));
        // listeFormes.add(new Carre(new Point(5,20), new Color(12,93,42),20));
        // listeFormes.add(new Rectangle(new Point(15,20), new Color(92,3,195),12,36));


        // for (Forme forme : listeFormes) {
        //     System.out.println(forme.toString());
        // }


        ListeFormes listeFormes2 = new ListeFormes();
        listeFormes2.add(new Cercle(new Point(10,10), new Color(112,63,2),15));
        listeFormes2.add(new Carre(new Point(5,20), new Color(12,93,42),20));
        listeFormes2.add(new Rectangle(new Point(15,20), new Color(92,3,195),12,36));

        System.out.println(listeFormes2.toString());
        listeFormes2.translation(10, -5);
        System.out.println(listeFormes2.toString());
    }
}