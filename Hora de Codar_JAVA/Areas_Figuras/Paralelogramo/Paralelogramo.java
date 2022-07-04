import java.util.Scanner;

public class Paralelogramo{
    public static void main(String[] args){
        Double base, altura, area;
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Paralelogramo");
        System.out.println("Informe a Base do seu Paralelogramo: ");
        base = in.nextDouble();
        System.out.println("Informe a Altura: ");
        altura = in.nextDouble();

        area = base*altura;
        System.out.println("A area do seu Paralelogramo é: " +area);
    }
}