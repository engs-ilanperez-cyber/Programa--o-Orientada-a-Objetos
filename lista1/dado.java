package lista1;

import java.util.Random;

public class dado {
    
    private Random random;
    
    public int rolar() {
        return random.nextInt(6) + 1;
    }
    
    public static void main(String[] args) {

        dado dado1 = new dado();
        dado dado2 = new dado();
        
        for (int i = 1; i <= 10; i++) {
            
            int valor1 = dado1.rolar();
            int valor2 = dado2.rolar();
            int soma = valor1 + valor2;
            
            System.out.println("dado 1: " + valor1);
            System.out.println("dado 2: " + valor2);
            System.out.println("soma: " + soma);
            
            if (soma == 7 || soma == 11) {
                System.out.println("voce ganhou!");
            } else if (soma == 2 || soma == 3 || soma == 12) {
                System.out.println("voce perdeu :(");
            }

        }
    }   
}
