import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args){
        Double lado, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Quadrado");
        System.out.println("Informe o um lado do seu Quadrado: ");
        lado = in.nextDouble();

        area = lado * lado;
        System.out.println("A area do seu Quadrado é: "+area+"cm²");
    }
}