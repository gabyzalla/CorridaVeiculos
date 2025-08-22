
public abstract class veiculo {
    private String nome;
    private int velocidade;

    public Veiculo(String nome, int velocidade) {
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    
    public abstract void mover();
}