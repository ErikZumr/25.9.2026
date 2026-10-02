package org.example;

public class Horse extends Sachovnice {
    int rada;
    char sloupec;

    public Horse(int rada, char sloupec) {
        this.rada = rada;
        this.sloupec = sloupec;
    }

    public String toString(){
        return "H"+ sloupec + rada;

    }

}
