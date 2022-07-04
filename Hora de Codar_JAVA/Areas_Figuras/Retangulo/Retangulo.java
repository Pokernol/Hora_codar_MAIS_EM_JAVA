import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args){
        Double base, alt, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Retangulo");
        System.out.println("Informe a Altura do seu Retangulo: ");
        alt = in.nextDouble();
        System.out.println("Informe a base do seu Retangulo: ");
        base = in.nextDouble();

        area = base*alt;

        System.out.println("A area do seu Retangulo é: "+area);
    }
}