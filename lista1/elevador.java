package lista1;

public class elevador {
    
    private int andarAtual;
    private double pesoAtual;
    private double pesoMaximo;
   
    public void entrar(double pesoPessoa) {
    
        double novoPeso = pesoAtual + pesoPessoa;
        
        if (novoPeso <= pesoMaximo) {
            pesoAtual = novoPeso;
            System.out.println("pessoa entrou");
        } else {
            System.out.println("peso maximo excedido");
        }
    }
    
    public void sair(double pesoPessoa) {
    
        pesoAtual -= pesoPessoa;
        System.out.println("pessoa saiu");
    }
}

