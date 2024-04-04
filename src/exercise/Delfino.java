package exercise;

public class Delfino extends Animale implements Nuotante{
    public Delfino() {
    }

    @Override
    public void verso() {
        System.out.println("sono un delfino e faccio il verso del delfino");
    }

    @Override
    public void mangia() {
        System.out.println("sono un delfino e mangio pesce");
    }

    @Override
    public void nuota() {
        System.out.println("sto nuotando a delfino ");
    }
}
