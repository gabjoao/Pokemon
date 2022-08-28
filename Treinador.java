public class Treinador extends Animal {
    private int idade;

    public Treinador(String nome, int idade) {
        super(nome);
        setIdade(idade);

    }

    @Override
    public String toString() {
        return super.toString() + "\nIdade: " + getIdade();
    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    
}
