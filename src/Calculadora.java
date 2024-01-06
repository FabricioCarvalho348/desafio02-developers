import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /*
        Você foi contratado para desenvolver um programa de console que realize operações matemáticas básicas
         como adição, subtração, multiplicação e divisão.
         O programa deve ser capaz de receber dois números e a operação a ser realizada, e imprimir o resultado.
         Você tem a liberdade de escolher a tecnologia que desejar.
        Tarefa:
        TODO: 1- O programa deve receber dois números do usuário.
        TODO: 2- O programa deve receber uma operação matemática a ser realizada (adição, subtração, multiplicação, divisão).
        TODO: 3- O programa deve calcular o resultado da operação matemática e imprimir o resultado na tela.
         */

        Scanner s = new Scanner(System.in);
        tela();
        Integer escolha = operacaoEscolhida();

        while(escolha != 0) {
            operacao(escolha, s);
            tela();
            escolha = operacaoEscolhida();
        }

        System.out.println("Saindo do programa.");

    }

    static void tela() {
        System.out.println("-------------- CALCULADORA BÁSICA --------------");
        System.out.println("-  1. ADIÇÃO                                   -");
        System.out.println("-  2. SUBTRAÇÃO                                -");
        System.out.println("-  3. MULTIPLICAÇÃO                            -");
        System.out.println("-  4. DIVISÃO                                  -");
        System.out.println("-  0. SAIR DO PROGRAMA                         -");
        System.out.println("- Digite um número para realizar uma operação: -");
    }

    static Integer operacaoEscolhida() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    static void operacao(Integer operacaoEscolhida, Scanner scanner) {
        Double numeroUm = null;
        Double numeroDois = null;
        Double resultado = null;
        switch (operacaoEscolhida) {
            case 1:
                System.out.println("Digite o primeiro número para somar: ");
                numeroUm = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                numeroDois = scanner.nextDouble();
                resultado = numeroUm + numeroDois;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case 2:
                System.out.println("Digite o primeiro número para subtrair: ");
                numeroUm = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                numeroDois = scanner.nextDouble();
                resultado = numeroUm - numeroDois;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 3:
                System.out.println("Digite o primeiro número para multiplicar: ");
                numeroUm = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                numeroDois = scanner.nextDouble();
                resultado = numeroUm * numeroDois;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case 4:
                System.out.println("Digite o primeiro número para realizar a divisão: ");
                numeroUm = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                numeroDois = scanner.nextDouble();
                resultado = numeroUm / numeroDois;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
            default:
                System.out.println("Digite um número válido.");
                break;
        }
    }
}