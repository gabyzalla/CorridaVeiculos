public class Carro extends Veiculo {

    
    public Carro() {
        
        super("Carro", 120);
    }

    @Override 
    public void mover() {
        System.out.println("Vruuummmm!");
    }
}