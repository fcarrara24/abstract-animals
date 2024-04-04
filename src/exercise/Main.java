package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void faiNuotare(Nuotante animale){
        animale.nuota();
    }

    public static void faiVolare(Volante animale){
        animale.vola();
    }
    public static void main(String[] args) {
        //array animale
        List<Animale> animali = new ArrayList<Animale>();
        animali.add(new Cane());
        animali.add(new Aquila());
        animali.add(new Passerotto());
        animali.add(new Delfino());

        for(Animale animale: animali){
            System.out.println("\n\ndorme.. ");
            animale.dormi();
            System.out.println("fa un verso ");
            animale.verso();
            System.out.println("cosa mangia?");
            animale.mangia();

            //interfacce (controllo che la classe sia chiamabile e poi faccio il casting
            if (animale instanceof Nuotante) {
                faiNuotare((Nuotante) animale);
            }
            if (animale instanceof Volante){
                faiVolare((Volante) animale);
            }

        }

    }
}
