package com.lasalle.quiz;
import android.app.Application;

/**
 * Created by hamza on 11/01/2017.
 */

public class Global extends  Application{

    public static int correcto ;
    public  int getCorrecto()
    {
        return  correcto;
    }

    public static void setCorrecto(int correcto) {
        Global.correcto = correcto;
    }

    public static int falso ;

    public static int getFalso() {
        return falso;
    }

    public static void setFalso(int falso) {
        Global.falso = falso;
    }

public void incrementCorrecto(){

    correcto++;
}
    public void incrementFalso(){

        falso++;
    }

    public void reset(){
        correcto=0;
        falso=0;
    }



}


