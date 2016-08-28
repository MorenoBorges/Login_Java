
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class log {
       public void tenta() throws IOException{
        Scanner leia = new Scanner(System.in);
        
    String loginteste;
    String senhateste;
    
    File User = new File("user.txt");
    File Senha = new File("senha.txt");
     Path caminhologin = Paths.get("user.txt");
     Path senhacaminho = Paths.get("senha.txt");
     String log1;
     String senha1;
     

        User.createNewFile();
        Senha.createNewFile();
        
        
        byte[] leituralogin = Files.readAllBytes(caminhologin);
        String login = new String(leituralogin);
        log1 = login;
        
        
        byte[] leiturasenha = Files.readAllBytes(senhacaminho);
        String senha = new String(leiturasenha);
        senha1 = senha;
        
        
        
       System.out.println("");
       loginteste = leia.nextLine();
       senhateste = leia.nextLine();
        

       
    if ((loginteste).equals(log1) && (senhateste).equals(senha1)){
       
        
        System.out.println("Concluido");
            
        }
    else{
      System.out.println("Usuário ou senha errado!"); 
      
      System.out.println("1-Logar novamente\n2-Cadastrar"); 
      int op=leia.nextInt();
      
      switch (op){
          case 1:;
      
      break;
          case 2:;
       break;
   }
    }
       }
   
   
}

