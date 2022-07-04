import java.util.Scanner;

public class IdadeUsuario{
        public static void main(String[] args){
            String nome;
            int num = 0;
            Scanner in = new Scanner(System.in);

            System.out.println("Olá usuário");
            System.out.println("Qual o seu nome?");
            nome = in.next();
            System.out.println("Qual sua idade?");
            num = in.nextInt();

            System.out.println("\n\tOlá  " +nome+ " Sua idade é: " +num);
        }
    }

