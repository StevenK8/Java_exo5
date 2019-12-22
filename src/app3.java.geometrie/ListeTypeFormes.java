package app3.java.geometrie;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Point;

public class ListeFormes extends ArrayList<Object>{

    private static final long serialVersionUID = 1L;

    public void translation(int x, int y){
        for (Object forme : this) {
            forme.translation(x, y);
        }
    }
    

    public String toString(){
        String result = "[ Liste\n";
        for (Object forme : this) {
            result+="\t"+forme.toString();
        }
        result+="]";
        return result;
    }

}