package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //array animale
        List<Animale> animali = new ArrayList<Animale>();
        animali.add(new Cane());
        animali.add(new Aquila());
        animali.add(new Passerotto());

        for(Animale animale: animali){
            System.out.println("dorme.. ");
            animale.dormi();
            System.out.println("fa un verso ");
            animale.verso();
            System.out.println("cosa mangia?");
            animale.mangia();

        }

    }
}
