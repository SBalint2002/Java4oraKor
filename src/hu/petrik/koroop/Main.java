package hu.petrik.koroop;

import hu.petrik.koroop.kor.Kor;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(13, 3, 6);
        Kor k2 = new Kor(6);
        Kor k3 = new Kor(Math.random()*100, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
    }
}
