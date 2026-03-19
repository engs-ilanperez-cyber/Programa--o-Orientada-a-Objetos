package lista1;

public class conta {
    
    private double saldo;
    private double limite;
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito realizado");
        } else {
            System.out.println("deposito invalido");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("saque invalido");
            return;
        }
        
        double saldoTotal = saldo + limite;
        
        if (valor <= saldoTotal) {
            saldo -= valor;
            System.out.println("saque realizado");
            
            if (saldo < 0) {
                System.out.println("esta usando cheque especial");
            }
        } else {
            System.out.println("saldo insuficiente");
        }
    }

}