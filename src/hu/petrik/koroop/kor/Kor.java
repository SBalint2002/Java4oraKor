package hu.petrik.koroop.kor;

public class Kor {
    private double sugar;
    private int x;
    private int y;

    //sugár és pont
    public Kor(double sugar, int pont1, int pont2) {
        this.sugar = sugar;
        this.x = pont1;
        this.y = pont2;
    }

    //csak sugár
    public Kor(double sugar) {
        this.sugar = sugar;
        x = 0;
        y = 0;
    }

    public double getKerulet() {
        return ((sugar * 2) * Math.PI);
    }

    public double getTerulet() {
        return ((sugar * sugar) * Math.PI);
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

}
