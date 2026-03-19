package lista1;

public class usuario {
   
    private String login;
    private String senha;
    private int tentativasFalhas;
    private boolean bloqueado;
    
    public boolean autenticar(String senha) {

        if (bloqueado) {
            System.out.println("usuario bloquado");
            return false;
        }
        
        if (this.senha.equals(senha)) {
            System.out.println("autenticado");
            tentativasFalhas = 0; 
            return true;
        } else {
    
            tentativasFalhas++;
            System.out.println("senha incorreta");
        
            if (tentativasFalhas >= 3) {
                bloqueado = true;
                System.out.println("usuario bloqueado");
            }
            
            return false;
        }
    }
}
