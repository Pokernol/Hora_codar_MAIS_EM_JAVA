import java.util.Scanner;

public class SemZero{
    public static void main(String[] args){
        Double n1, n2, res;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos fazer ima divisão?");
        System.out.println("informe o primeiro número: ");
        n1 = in.nextDouble();

        System.out.println("Informe o segundo número: ");
        n2 = in.nextDouble();
        while(n2 <= 0){
            System.out.println("O Segundo numero deve ser maior que 0 (zero): ");
            n2 = in.nextDouble();
        }
        res = n1/n2;
        System.out.printf("%.0f dividido por %.0f é = %.0f", n1, n2, res);
    }
}