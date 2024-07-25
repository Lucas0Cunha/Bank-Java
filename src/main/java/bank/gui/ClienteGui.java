package bank.gui;

import bank.controller.ClienteController;
import bank.controller.ContaController;
import bank.controller.FuncionarioController;
import bank.models.*;

import java.util.Scanner;

public class ClienteGui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaController contaController = new ContaController();
        ContaPoupanca guiPou = new ContaPoupanca("3", "3");
        int opcao = scanner.nextInt();


        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Tipo de Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {


                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 0:
                        System.out.println("Encerrando o programa...");
                        return;
                    case 1:
                        ClienteController clienteController = new ClienteController();
                        Cliente Gui = new Cliente();
                        boolean continuar = true;
                        while (continuar) {
                            System.out.println("Escolha a operação:");
                            System.out.println("1. Cadastrar cliente");
                            System.out.println("2. Buscar cliente");
                            System.out.println("3. Atualizar cliente");
                            System.out.println("4. Deletar cliente");
                            //melhorar o case 0
                            System.out.println("0. Voltar ao menu principal");

                            switch (opcao) {
                                case 1:

                                    System.out.println("Digite o nome do cliente:");
                                    Gui.setName(scanner.next());
                                    System.out.println("Digite o CPF do cliente:");
                                    Gui.setCpfCnpj(scanner.next());
                                    clienteController.add(Gui);
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar:");
                                    Gui.setCpfCnpj(scanner.next());
                                    clienteController.get(Gui.getCpfCnpj());
                                    break;
                                case 3:
                                    System.out.println("Digite o novo nome do cliente:");
                                    Gui.setName(scanner.next());
                                    clienteController.update(Gui);
                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        clienteController.delete(Gui);
                                    } else break;
                                case 0:
                                    System.out.println("Saindo...");
                                    continuar = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                    break;
                            }
                        }
                        scanner.close();

                        break;
                    case 2:

                        FuncionarioController funcionarioController = new FuncionarioController();
                        Funcionario Gui1 = new Funcionario();
                        boolean next = true;
                        while (next) {
                            System.out.println("Escolha a operação:");
                            System.out.println("1. Cadastrar funcionário");
                            System.out.println("2. Buscar funcionário");
                            System.out.println("3. Atualizar funcionário");
                            System.out.println("4. Deletar funcionário");
                            System.out.println("0. Voltar ao menu principal");

                            switch (opcao) {
                                case 1:

                                    System.out.println("Digite o nome do cliente:");
                                    Gui1.setName(scanner.next());
                                    System.out.println("Digite o CPF do cliente:");
                                    Gui1.setCpfCnpj(scanner.next());
                                    funcionarioController.add(Gui1);
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar:");
                                    Gui1.setCpfCnpj(scanner.next());
                                    funcionarioController.get(Gui1.getCpfCnpj());
                                    break;
                                case 3:
                                    System.out.println("Digite o novo nome do cliente:");
                                    Gui1.setName(scanner.next());
                                    funcionarioController.update(Gui1);
                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        funcionarioController.delete(Gui1);
                                    } else break;
                                case 0:
                                    System.out.println("Saindo...");
                                    next = false;


                                System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                break;
                            }
                        }
                    case 3:

                        while (true) {
                            System.out.println("\n### Tipos de Conta ###");
                            System.out.println("1. Conta Crédito");
                            System.out.println("2. Conta Débito");
                            System.out.println("3. Conta Poupança");
                            System.out.println("4. Conta Salário");
                            System.out.println("0. Sair");
                            System.out.print("Escolha uma opção: ");
                            int tipoConta = scanner.nextInt();

                            switch (tipoConta) {
                                case 0:
                                    System.out.println("Encerrando o programa...");
                                    return;
                                case 1:


                                    //errado
                                    ContaCredito guiCred = new ContaCredito("3", "3");
                                    boolean next1 = true;
                                    while (next1) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");

                                        switch (opcao) {
                                            case 1:
                                                //n deve ser fornecido pelo usuario arrumar dps
                                                System.out.println("Digite o número do cliente:");
                                                guiCred.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                guiCred.setCpfCnpj(scanner.next());
                                                contaController.add(guiCred);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                guiCred.setCpfCnpj(scanner.next());
                                                contaController.get(guiCred.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                guiCred.setNumero(scanner.next());
                                                contaController.update(guiCred);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(guiCred);
                                                } else break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                next1 = false;


                                            System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                            break;
                                        }
                                    }

                                case 2:
                                    //ERRADO
                                    Contadebito guiDeb = new Contadebito("3", "3");
                                    boolean next2 = true;
                                    while (next2) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");

                                        switch (opcao) {
                                            case 1:
                                                //n deve ser fornecido pelo usuario arrumar dps
                                                System.out.println("Digite o número do cliente:");
                                                guiDeb.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                guiDeb.setCpfCnpj(scanner.next());
                                                contaController.add(guiDeb);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                guiDeb.setCpfCnpj(scanner.next());
                                                contaController.get(guiDeb.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                guiDeb.setNumero(scanner.next());
                                                contaController.update(guiDeb);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(guiDeb);
                                                } else break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                next2 = false;


                                            System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                            break;
                                        }
                                    }

                                    //ERRADO
                                case 3:

                                    boolean next3 = true;
                                    while (next3) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");

                                        switch (opcao) {
                                            case 1:
                                                //n deve ser fornecido pelo usuario arrumar dps
                                                System.out.println("Digite o número do cliente:");
                                                guiPou.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                guiPou.setCpfCnpj(scanner.next());
                                                contaController.add(guiPou);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                guiPou.setCpfCnpj(scanner.next());
                                                contaController.get(guiPou.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                guiPou.setNumero(scanner.next());
                                                contaController.update(guiPou);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(guiPou);
                                                } else break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                next2 = false;


                                            System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                            break;
                                        }
                                    }

                                case 4:
                                    //ERRADO
                                    ContaSalario contaSalario = new ContaSalario("3", "3");
                                    boolean next4 = true;
                                    while (next4) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");

                                        switch (opcao) {
                                            case 1:
                                                //n deve ser fornecido pelo usuario arrumar dps
                                                System.out.println("Digite o número do cliente:");
                                                contaSalario.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                contaSalario.setCpfCnpj(scanner.next());
                                                contaController.add(guiPou);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                contaSalario.setCpfCnpj(scanner.next());
                                                contaController.get(contaSalario.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                contaSalario.setNumero(scanner.next());
                                                contaController.update(contaSalario);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(contaSalario);
                                                } else break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                next2 = false;


                                            System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                            break;
                                        }


                                    }
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                        }/*catch(InputMismatchException e){
                                                                    e.printStackTrace();
                                                                }*/

                }


            }finally {
                System.out.println("Fim da aplicação");
            }
        }


    }



    }








