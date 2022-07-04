import java.util.Scanner;

public class Trapezio{
    public static void main(String[] args){
        Double bMaior, bMenor, altura, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Trapezio");
        System.out.println("Informe a Base Maior: ");
        bMaior = in.nextDouble();
        System.out.println("Informe a Base Menor: ");
        bMenor = in.nextDouble();
        System.out.println("Informe a altura: ");
        altura = in.nextDouble();

        area = (bMaior + bMenor)*altura/2;
        System.out.println("A area do seu Trapezio é: " + area);
    }
}