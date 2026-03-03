public class  filme {
    public String nome;
    public int duracao;
    private int estoque;

    public void setestoque(int quantidade) {
        if(quantidade > 0)
            estoque = quantidade;
    }

}