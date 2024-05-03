import java.util.Scanner;

public class condicaoBissexto {
    public static int ano;
    public static boolean anoBissexto;
    public static Scanner leTeclado = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Por favor, digite um ano:");
        ano = leTeclado.nextInt();

        anoBissexto = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? true : false;

        if (anoBissexto){
            System.out.printf("O ano %d é bissexto", ano);
        }
        else {
            System.out.printf("O ano %d não é bissexto", ano);
        }
    }
}