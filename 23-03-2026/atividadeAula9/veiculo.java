public class veiculo {
    public void mover() {
        System.out.println("o veiculo esta movendo..");
    }
    
}

class carro extends veiculo {
    @Override
    public void mover() {
        System.out.println("o carro esta movendo..");
    }
}

class bicicleta extends veiculo {
    @Override
    public void mover() {
        System.out.println("a bicicleta esta movendo..");
    }
}

class main {
    public static void moverVeiculo(veiculo v) {
        v.mover();
    }

    public static void main(String[] args) {
        veiculo v1 = new carro();
        veiculo v2 = new bicicleta();

        moverVeiculo(v1);
        moverVeiculo(v2);
    }
}