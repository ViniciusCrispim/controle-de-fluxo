package br.com.viniciuscrispim;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = input.nextInt();

        System.out.println("Parametro 1: " + parametroUm);
        System.out.println("Parametro 2: " + parametroDois);
    }
}