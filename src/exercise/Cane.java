package exercise;

public class Cane extends Animale implements Nuotante{

    public Cane() {
    }

    @Override
    public void verso() {
        System.out.println("sono un cane, faccio wof");
    }

    @Override
    public void mangia() {
        System.out.println("sono un cane, mangio carne");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando a cagnolino");
    }
}
