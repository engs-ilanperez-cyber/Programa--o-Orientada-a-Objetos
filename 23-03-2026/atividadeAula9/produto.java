public class produto {
    String nome;
    double preco;
    int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    @Override
    public String toString() {
        return "Produto: " + nome + "(" + quantidade + ") - " + preco;
    }
}

class main {
    public static void main(String[] args) {
        produto m = new produto("maca", 4.99, 80);
        System.out.println(m);
        produto b = new produto("banana", 3.00, 120);
        System.out.println(b);
    }
}