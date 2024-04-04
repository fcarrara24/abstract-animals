package exercise;

public class Passerotto extends Animale{
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
}
