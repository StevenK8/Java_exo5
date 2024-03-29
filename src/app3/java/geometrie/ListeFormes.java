package app3.java.geometrie;

import java.util.ArrayList;

public class ListeFormes extends ArrayList<Forme>{

    private static final long serialVersionUID = 1L;

    public void translation(int x, int y){
        for (Forme forme : this) {
            forme.translation(x, y);
        }
    }

    public String toString(){
        String result = "[ Liste\n";
        for (Forme forme : this) {
            result+="\t"+forme.toString();
        }
        result+="]";
        return result;
    }

}