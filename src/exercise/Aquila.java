package exercise;

public class Aquila extends Animale implements Volante{

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

    @Override
    public void vola() {
        System.out.println("volo come un aquila");
    }
}
