import java.util.Scanner;

public class Numero{
    public static void main(String[] args){
        Double numero;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o numero para saber se é Positivo, Negativo ou Neutro: ");
        numero = in.nextDouble();

        if(numero == 0){
            System.out.printf("O numero informado foi %f e ele é NEUTRO",numero);
        }else if(numero < 0){
            System.out.printf("O numero informado foi %f e ele é NEGATIVO",numero);
        }else{
            System.out.printf("O numero informado foi %f e ele é POSITIVO",numero);
        }
    }
}