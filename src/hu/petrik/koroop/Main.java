package hu.petrik.koroop;

import hu.petrik.koroop.kor.Kor;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Kor k1 = new Kor(13, 3, 6);
        Kor k2 = new Kor(6);
        Kor k3 = new Kor(Math.random()*100+1, (int)(Math.random()*10), (int)(Math.random()*10));

        out.printf("K1 kör kerülete: %f\n",(k1.getKerulet()));
        out.printf("K1 kör területe: %f\n",(k1.getTerulet()));

        Scanner sc = new Scanner(in);
        out.print("Adjon meg egy sugár méretet amire állítsam az K1-et: ");
        k1.setSugar(sc.nextDouble());
        out.printf("A kör új kerülete: %f\n\n",k1.getKerulet());

        out.println(k1.toString());

        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length; i++) {
            korok[i] = new Kor(Math.random()*100+1, (int)(Math.random()*10), (int)(Math.random()*10));
        }

        double legnagyobb = 0;
        for (int i = 0; i < korok.length; i++) {
            if (korok[i].getTerulet() > legnagyobb){
                legnagyobb = korok[i].getTerulet();
            }
        }
        out.printf("A legnagyobb kör területe: %.2f",legnagyobb);




    }
}
