
public class funcionario {
    
    public  String nome;
    public  double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
   
}

class gerente extends funcionario {

    public  String setor;

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    public String getSetor() {
        return setor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public static void main(String[] args) {
        
        gerente Gerente = new gerente();
        Gerente.setNome("Joao");
        Gerente.setSalario(5000);
        Gerente.setSetor("vendas");

        System.err.println("Nome: " + Gerente.getNome());
        System.err.println("Salario: " + Gerente.getSalario());
        System.err.println("Setor: " + Gerente.getSetor());
    }
}