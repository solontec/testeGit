import java.util.Scanner;

public class testegit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu user");
        String user = scanner.nextLine();

        System.out.println("Digite sua senha");
        String pass = scanner.nextLine();

        boolean page = true;

        while (page) {


            if(user.equals("Guisolon") && pass.equals("1234")){
                System.out.println("Login efetuado");
                break;

            }  else  {
                System.out.println("User errado tente novamente");
            }

            scanner.close();
        
           }

            
        }
            
        
}