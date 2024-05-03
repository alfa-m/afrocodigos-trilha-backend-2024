import java.util.Scanner;

public class Main {
    public static int numero;
    public static int i;

    public static boolean checaPositivo(int numeroEntrada) {
        if (numeroEntrada > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void imprimePositivosImpar(int numeroPositivo){
        System.out.printf("Os %d primeiros números ímpares são: ", numeroPositivo);
        for (i = 1; i <= (numeroPositivo*2); i = i + 2){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        System.out.println("Por favor, insira um número inteiro positivo: ");
        numero = leTeclado.nextInt();

        leTeclado.close();

        if (checaPositivo(numero)) {
            imprimePositivosImpar(numero);
        }
        else{
            System.out.println("Você inseriu uma entrada inválida. Tente novamente");
        }
    }
}