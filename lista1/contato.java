package lista1;

public class contato {

    private String nome; 
    private String telefone;
    
 
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getTelefone() {
        return telefone;
    }
    

    public void setTelefone(String telefone) {

        if (telefone.length() >= 8) {
            this.telefone = telefone;
            System.out.println("Telefone valido");
        } else {
            System.out.println("Numero invalido");
        }
    }

}
