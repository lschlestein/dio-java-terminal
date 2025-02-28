package dioBancoJavaTerminal;

import Model.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria;

        // Exibir as mensagens para o usuário
        // Obter os dados da conta, informados pelo usuário

        System.out.println("Por favor, digite o número da conta: ");
        var inNumeroConta = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite o número da agência: ");
        var inNumeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        var inNomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        var inSaldoCliente = Double.parseDouble(sc.nextLine());

        contaBancaria = new ContaBancaria(inNumeroConta, inNumeroAgencia, inNomeCliente, inSaldoCliente);
        // Exibir dados da conta criada
        System.out.println(contaBancaria);


    }
}