public class Pokemon extends Animal {
    private int HPTotal;
    private int HPAtual;
    private int iniciativa;
    private String tipo1;
    private String tipo2;
    private String nomeAtaque;
    private int valorAtaque;

    //Construtor com os dois tipos
    public Pokemon(String nome, int hPTotal, int hPAtual, int iniciativa, String tipo1, String tipo2, String nomeAtaque, int valorAtaque) throws Exception {
        super(nome);

        boolean sucesso = false;

        if (HPTotal < 0)
            throw new Exception("HP invalido");
        else 
            sucesso = true;

        if (hPAtual < 0)
            throw new Exception("HP invalido");
        else 
            sucesso = true;
            
        if (iniciativa < 0)
            throw new Exception("Iniciativa invalida");
        else 
            sucesso = true;

        if (tipo1.length() < 3)
            throw new Exception("Tipo invalido");
        else 
            sucesso = true;

        if (tipo2.length() < 3)
            throw new Exception("Tipo invalido");
        else 
            sucesso = true;

        if (nomeAtaque.length() < 3)
            throw new Exception("Nome do ataque invalido invalido");
        else 
            sucesso = true;

        if (valorAtaque < 0)
            throw new Exception("Valor do ataque invalido");
        else 
            sucesso = true;


        if(sucesso){
            setHPTotal(hPTotal);
            setHPAtual(hPAtual);
            setIniciativa(iniciativa);
            setTipo1(tipo1);
            setTipo2(tipo2);
            setNomeAtaque(nomeAtaque);
            setValorAtaque(valorAtaque);
        }

    }

    //Construtor com apenas um tipo
    public Pokemon(String nome, int hPTotal, int hPAtual, int iniciativa, String tipo1, String nomeAtaque, int valorAtaque) throws Exception{
        super(nome);

        boolean sucesso = false;

        if (HPTotal < 0)
            throw new Exception("HP invalido");
        else 
            sucesso = true;

        if (hPAtual < 0)
            throw new Exception("HP invalido");
        else 
            sucesso = true;
            
        if (iniciativa < 0)
            throw new Exception("Iniciativa invalida");
        else 
            sucesso = true;

        if (tipo1.length() < 3)
            throw new Exception("Tipo invalido");
        else 
            sucesso = true;

        if (nomeAtaque.length() < 3)
            throw new Exception("Nome do ataque invalido invalido");
        else 
            sucesso = true;

        if (valorAtaque < 0)
            throw new Exception("Valor do ataque invalido");
        else 
            sucesso = true;


        if(sucesso){
            setHPTotal(hPTotal);
            setHPAtual(hPAtual);
            setIniciativa(iniciativa);
            setTipo1(tipo1);
            setNomeAtaque(nomeAtaque);
            setValorAtaque(valorAtaque);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getHPTotal() {
        return HPTotal;

    }

    public void setHPTotal(int hPTotal) {
        HPTotal = hPTotal;

    }

    public int getHPAtual() {
        return HPAtual;

    }

    public void setHPAtual(int hPAtual) {
        HPAtual = hPAtual;

    }

    public int getIniciativa() {
        return iniciativa;

    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;

    }

    public String getTipo1() {
        return tipo1;

    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;

    }

    public String getTipo2() {
        return tipo2;

    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;

    }

    public String getNomeAtaque() {
        return nomeAtaque;

    }

    public void setNomeAtaque(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;

    }

    public int getValorAtaque() {
        return valorAtaque;

    }

    public void setValorAtaque(int valorAtaque) {
        this.valorAtaque = valorAtaque;

    }

    
}
