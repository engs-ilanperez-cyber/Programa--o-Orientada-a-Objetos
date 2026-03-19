package lista1;

public class produto {
    
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private int qtdEstoque;

    public double lucroPresumido() {
        return (precoVenda - precoCusto) * qtdEstoque;
    }
    
    public void vender(int qtd) {
        
        if (qtd <= qtdEstoque) {
            qtdEstoque -= qtd;
            System.out.println("venda realizada");
        } else {
            System.out.println("estoque insuficiente");
        }
    }
}