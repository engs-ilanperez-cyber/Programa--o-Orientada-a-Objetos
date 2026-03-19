package lista1;

public class termometro {
    private double temperaturaAtual;
    
    public void aumentarTemp(double valor) {
        temperaturaAtual += valor;
    }
    
    public void diminuirTemp(double valor) {
        temperaturaAtual -= valor;
    }
    
    public double exibirFahrenheit() {
        return temperaturaAtual * 1.8 + 32;
    }
}