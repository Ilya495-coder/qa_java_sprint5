package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Kittens kittens;
    public Lion(String sex,Kittens kittens) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.kittens=kittens;
    }

    public int getKittens() {
        return kittens.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return kittens.getFood("Хищник");

    }
}
