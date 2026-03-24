public class forma {
    double area() {
        System.out.println("escolha uma forma");
        return 0;
    }
}

class retangulo extends forma {
    private int altura;
    private int largura;

    public retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    double area() {
        return altura * largura;
    }
}

class circulo extends forma {
    private int raio;

    public circulo(int raio) {
        this.raio = raio;
    }

    @Override
    double area() {
        return Math.PI * raio * raio;
    }
    public static void main(String[] args) {
        forma f1 = new circulo(5);
        System.out.println(f1.area());
        forma f2 = new retangulo(4, 5);
        System.out.println(f2.area());
        forma f3 = new retangulo(8, 5);
        System.out.println(f3.area());
    }
}