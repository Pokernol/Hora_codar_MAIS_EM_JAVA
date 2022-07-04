import java.util.Scanner;

public class Triangulo{
    public static void main(String[] args){
        Double base, altura, area;
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Triangulo");
        System.out.println("Informe a base do seu Triangulo: ");
        base = in.nextDouble();
        System.out.println("Informe a altura do seu Triangulo: ");
        altura = in.nextDouble();

        area = (base * altura)/2;

        System.out.println("A area do seu Triangulo é: "+area);
    }
}