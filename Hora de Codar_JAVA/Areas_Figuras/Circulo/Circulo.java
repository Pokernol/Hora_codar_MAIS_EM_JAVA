import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){

        Double raio, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Vamos calcular o Raio de um Circulo");
        System.out.println("Informe o Raio do seu Circulo: ");

        raio = in.nextDouble();

        area = 3.1415926535898 * raio * raio;

        System.out.println("A area do seu circulo é: "+area);
    }
}
