package br.com.viniciuscrispim;

import br.com.exception.NumeroInvalidoException;
import br.com.exception.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var terminate = false;

        while(!terminate) {
            try{
                System.out.println("Digite o primeiro parâmetro");
                var parametroUm = lerInteiro(input);
                System.out.println("Digite o segundo parâmetro");
                var parametroDois = lerInteiro(input);

                contar(parametroUm, parametroDois);
                terminate = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                input.nextLine();
            } catch (ParametrosInvalidosException e) {
                System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
            }
        }

    }

    static int lerInteiro(Scanner input) throws NumeroInvalidoException {
        try{
            return input.nextInt();
        } catch (NumberFormatException e) {
            throw new NumeroInvalidoException("Entrada inválida");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }

        int contagem = parametroDois - parametroUm;
        System.out.printf("\nIniciando a contagem:\n");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}