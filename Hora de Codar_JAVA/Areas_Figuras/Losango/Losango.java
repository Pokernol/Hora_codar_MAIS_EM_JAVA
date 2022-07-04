import java.util.Scanner;
public class Losango{
    public static void main(String[] args){
        Double dMaior, dMenor, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o area de um Losango");
        System.out.println("Informe a Diagonal maior");
        dMaior = in.nextDouble();
        System.out.println("Informe a Diagonal Menor");
        dMenor = in.nextDouble();

        area = (dMaior * dMenor)/2;

        System.out.println("A area do seu Losango é: " + area);
    }
}