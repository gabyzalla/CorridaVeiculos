public class Bicicleta extends Veiculo {

    public Bicicleta() {
        super("Bicicleta", 20);
    }

    @Override
    public void mover() {
        System.out.println("Pedalando...");
    }
}