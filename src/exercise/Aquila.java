package exercise;

public class Aquila extends Animale{

    public Aquila() {
    }

    @Override
    public void verso() {
        System.out.println("sono un aquila, faccio il verso dell'aquila");
    }

    @Override
    public void mangia() {
        System.out.println("sono un aquila, mangio topi");
    }
}
