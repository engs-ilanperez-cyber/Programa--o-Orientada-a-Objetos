
package lista1;

public class lampada {

    boolean ligada;
    int potencia;
    
    void ligar() {
        ligada = true;
        System.out.println("Ligada? " + ligada);
    }
    
    void desligar() {
        ligada = false;
        System.out.println("Ligada? " + ligada);
    }
    
    void meiaLuz() {
        if (ligada) {
            System.out.println("Lâmpada em meia luz");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }
    
    public static void main(String[] args) {
        lampada lampada = new lampada();
        lampada.potencia = 60;

        lampada.ligar();
        
        lampada.meiaLuz();
        
        lampada.desligar();
        
        lampada.meiaLuz();
    }
}