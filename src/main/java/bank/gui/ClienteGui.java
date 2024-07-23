package bank.gui;

import bank.models.ContaCredito;
import bank.repository.impl.ContaDAOImpl;

import java.util.Scanner;

public class ClienteGui {
    public static void main(String[] args) {
//FAZER O MENU DO USUARIO

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Tipo de Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    return;
                case 1:

                    System.out.println("CRUD");
                    break;
                case 2:

                    System.out.println("CRUD");
                    break;
                case 3:

                    while (true) {
                        System.out.println("\n### Tipos de Conta ###");
                        System.out.println("1. Conta Crédito");
                        System.out.println("2. Conta Débito");
                        System.out.println("3. Conta Poupança");
                        System.out.println("4. Conta Salário");
                        System.out.println("0. Voltar ao menu principal");
                        System.out.print("Escolha um tipo de conta: ");
                        int tipoConta = scanner.nextInt();

                        switch (tipoConta) {
                            case 0:
                                    System.out.println("\n### Menu ###");
                                    System.out.println("1. Cliente");
                                    System.out.println("2. Funcionário");
                                    System.out.println("3. Tipo de Conta");
                                    System.out.println("0. Sair");
                                    System.out.print("Escolha uma opção: ");

                                    switch (escolha) {
                                        case 0:
                                            System.out.println("Encerrando o programa...");
                                            return;
                                        case 1:

                                            System.out.println("CRUD");
                                            break;
                                        case 2:

                                            System.out.println("CRUD");
                                            break;
                                        case 3:
                                        break;
                                        case 4:
                              /*
                                ContaSalario contaSalario = new ContaSalario();
                                contas.add(contaSalario);
                                System.out.println("Conta Salário criada."); */
                                            break;
                                        default:
                                            System.out.println("Opção inválida. Tente novamente.");
                                            break;
                                    }
                            case 1:

                              /*  ContaCredito contaCredito = new ContaCredito());
                                ContaCredito.add(contaCredito);
                                System.out.println("Conta Crédito criada."); */
                                break;
                            case 2:
                               /*
                                ContaDebito contaDebito = new ContaDebito();
                                contas.add(contaDebito);
                                System.out.println("Conta Débito criada."); */
                                break;
                            case 3:
                               /*
                                ContaPoupanca contaPoupanca = new ContaPoupanca();
                                contas.add(contaPoupanca);
                                System.out.println("Conta Poupança criada."); */
                                break;
                            case 4:
                              /*
                                ContaSalario contaSalario = new ContaSalario();
                                contas.add(contaSalario);
                                System.out.println("Conta Salário criada."); */
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                                break;
                        }
                    }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        }

        
    }
}
