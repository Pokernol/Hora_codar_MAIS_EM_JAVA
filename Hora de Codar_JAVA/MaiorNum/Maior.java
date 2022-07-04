import java.util.Scanner;

public class Maior{
    public static void main(String[] args){
        int num = 0;
        int maior = 0;

        System.out.printf("Ola Usuário por favor digite 3 números e eu irei dizer qual deles é o maior");
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe o %dº numero:",i);
            num = in.nextInt();
            if(num > maior){
                maior = num;
            }
        }
        System.out.printf("O maior numero informado foi %d\n",maior);
    }
}