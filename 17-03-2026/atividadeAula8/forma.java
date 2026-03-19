public class forma {

    public String cor;
    public boolean preenchida;

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setPreenchida(boolean preenchida) {
        this.preenchida = preenchida;
    }
    
    public boolean isPreenchida() {
        return preenchida;
    }
}

class Retangulo extends forma {
    
    public double largura;
    public double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

class Circulo extends forma {
    
    public double raio;

    public double calcularArea() {
        return 3.14 * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public static void main(String[] args) {
        
        // Testando Retangulo
        Retangulo ret = new Retangulo();
        ret.setCor("azul");
        ret.setPreenchida(true);
        ret.setLargura(5);
        ret.setAltura(3);
        
        System.out.println("area: " + ret.calcularArea());
        
        Circulo circ = new Circulo();
        circ.setCor("vermelho");
        circ.setPreenchida(false);
        circ.setRaio(4);
        
        System.out.println("area: " + circ.calcularArea());
    }
}

