import java.util.Scanner;

public class CalculadoraExt {
    public static void main(String[] argv) {
        Scanner leitorNumeros = new Scanner(System.in);
        int operacaoSelecionada = leitorNumeros.nextInt();
        double num1 = leitorNumeros.nextDouble();
        double num2 = leitorNumeros.nextDouble();

        if (operacaoSelecionada == 1) {
            System.out.println(num1+num2);
        } else if (operacaoSelecionada == 2) {
            System.out.println(num1-num2);
        } else if (operacaoSelecionada == 3) {
            System.out.println(num1*num2);
        } else if (operacaoSelecionada == 4) {
            System.out.println(num1/num2);
        } else {
            System.out.println("Operação não reconhecida, tente novamente!");
        }
    }
}
