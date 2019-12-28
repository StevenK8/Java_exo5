package app3.java.geometrie;

import java.util.ArrayList;

public class ListeTypeFormes<E> extends ArrayList<E>{

    private static final long serialVersionUID = 1L;

    public void translation(int x, int y){
        for (E forme : this) {
            Forme f = (Forme) forme;
            f.translation(x, y);
        }
    }
    

    public String toString(){
        String result = "[ ListeType\n";
        for (Object forme : this) {
            result+="\t"+forme.toString();
        }
        result+="]";
        return result;
    }

}