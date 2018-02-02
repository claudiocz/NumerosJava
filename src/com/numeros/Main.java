package com.numeros;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //clase Scanner para ingresar datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        String valor = scanner.nextLine(); //
        int n = Integer.parseInt(valor);
        NumeroJava miNumero = new NumeroJava(n);

        if (miNumero.esPar()) {
            System.out.println("Es Par");
        } else
            System.out.println("Es Impar");

    }

}
