public class pessoa {
    public String nome;

    public pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

class Aluno extends pessoa {
    
    public String matricula;

    public Aluno(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Maria Santos", "202312345");
        
        System.out.println("nome: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getMatricula());
        
    }
}

