package com.example;

import java.util.List;

public class Fox {
    boolean isWild;
    Foxkinds foxkinds;
    String kind;

    public Fox(Foxkinds foxkinds, String kind) throws Exception {
        this.foxkinds = foxkinds;
        if(kind.equals("Хищник")){
            isWild = true;
        }else if(kind.equals("Травоядное")){
            isWild = false;
        }else{
            throw new Exception("Может быть только хищник или травоядное");
        }
        this.kind = kind;
    }

    public int getKitsCount(){
        return 3;
    }
    public boolean getIsWild(){
        return isWild;
    }

    public List<String> getFood()throws Exception{
        return foxkinds.getFood("Хищник");
    }

    public boolean doesLiveInCity( boolean isWild){
        if(! isWild){
            return true;
        }else{
            return false;
        }
    }
}
