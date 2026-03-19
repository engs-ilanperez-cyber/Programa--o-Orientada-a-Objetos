package lista1;

public class combustivel {
    
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    
    public void abastecerPorValor(double valor) {
      
        double litros = valor / valorLitro;
        
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("litros abastecidos: " + String.format("%.2f", litros));
        } else {
            System.out.println("combustivel insuficiente na bomba.");
        }
    }
    
    public void abastecerPorLitro(double litros) {
   
        if (litros <= quantidadeCombustivel) {
            double valorPagar = litros * valorLitro;
            quantidadeCombustivel -= litros;

            System.out.println("valor a pagar: " + String.format("%.2f", valorPagar));
           
        } else {
            System.out.println("combustivel insuficiente na bomba");

        }
    }
    
}
