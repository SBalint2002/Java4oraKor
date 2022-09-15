package hu.petrik.koroop;

import hu.petrik.koroop.kor.Kor;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(13, 3, 6);
        Kor k2 = new Kor(6);
        Kor k3 = new Kor(Math.random()*100, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1);

        out.printf("K1 kör kerülete: %f\n",(k1.getKerulet()));
        out.printf("K1 kör területe: %f\n",(k1.getTerulet()));
    }
}
