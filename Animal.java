public class Animal {
    private String nome;

    public Animal(String nome) {
        setNome(nome);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
