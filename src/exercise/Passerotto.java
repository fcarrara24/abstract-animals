package exercise;

public class Passerotto extends Animale implements Volante{
    public Passerotto() {
    }

    @Override
    public void verso() {
        System.out.println("sono un passerotto, faccio pio ");
    }

    @Override
    public void mangia() {
        System.out.println("sono un passerotto, mangio becchime");
    }

    @Override
    public void vola() {
        System.out.println("volo come un passerotto");
    }
}
