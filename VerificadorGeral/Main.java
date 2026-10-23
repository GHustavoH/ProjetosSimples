package VerificadorGeral;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FuncoesBase funcoesBase = new FuncoesBase();

        byte opcao = 0;

        do {
            System.out.println("\n=============== Bem Vindo ===============\n");
            System.out.println("1- Inverter Texto");
            System.out.println("2- Verificar se palavra é um palíndromo");
            System.out.println("3- Contar vogais de um texto");
            System.out.println("4- Verificar se número é par ou ímpar");
            System.out.println("5- Ver o fatorial de um número");
            System.out.println("6- Sair");
            System.out.println("\n==========================================\n");
            System.out.print("Opção escolhida: ");

            try {
                opcao = scanner.nextByte();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("ERRO: " + e.getMessage());
                System.out.println("Digite uma opção numérica válida!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o texto a ser invertido: ");
                    String textoNormal = scanner.nextLine();

                    funcoesBase.definirPalavra(textoNormal);

                    System.out.println("Texto invertido: " + funcoesBase.inverterPalavra());
                    break;

                case 2:
                    System.out.print("Digite uma palavra: ");
                    String palavra = scanner.nextLine();

                    funcoesBase.definirPalavra(palavra);

                    System.out.println("É palíndromo? " + funcoesBase.verificarPalindromo());
                    break;

                case 3:
                    System.out.print("Digite um texto: ");
                    String texto = scanner.nextLine();

                    funcoesBase.definirPalavra(texto);

                    System.out.println("Quantidade de vogais: " + funcoesBase.contadorVogais());
                    break;

                case 4:
                    System.out.print("Digite um número inteiro: ");

                    try {
                        int numeroParImpar = scanner.nextInt();
                        scanner.nextLine();

                        funcoesBase.definirNumero(numeroParImpar);

                        System.out.println(funcoesBase.verificadorParImpar());

                    } catch (Exception e) {
                        System.out.println("ERRO: " + e.getMessage());
                        System.out.println("Digite um número inteiro válido!");
                        scanner.nextLine();
                    }
                    break;

                case 5:
                    System.out.print("Digite um número inteiro: ");

                    try {
                        int numeroFatorial = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroFatorial < 0) {
                            System.out.println("Não é possível calcular o fatorial de um número negativo.");
                        } else {
                            funcoesBase.definirNumero(numeroFatorial);

                            System.out.println("Fatorial: " + funcoesBase.transformadorFatorial());
                        }

                    } catch (Exception e) {
                        System.out.println("ERRO: " + e.getMessage());
                        System.out.println("Digite um número inteiro válido!");
                        scanner.nextLine();
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        scanner.close();
    }
}
