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
        ContaPoupanca ? = new ContaPoupanca("3", "3");

        /*Thread tarefa = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10000); // Espera 10 segundos
                    System.out.println("Verificando status... Status: Online");

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("A tarefa de fundo foi interrompida.");
                }
            }
        });

        // Inicia a thread
        tarefa.setDaemon(true); // A thread será encerrada quando a aplicação principal for encerrada
        tarefa.start(); */

        while (true) {
            System.out.println("\n### Menu ###");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Tipo de Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            try {


                int escolha = 0;

                switch (opcao) {
                    case 0:
                        System.out.println("Encerrando o programa...");
                        return;
                    case 1:
                        ClienteController clienteController = new ClienteController();
                        Cliente ? = new Cliente();
                        boolean continuar = true;
                        while (continuar) {
                            System.out.println("Escolha a operação:");
                            System.out.println("1. Cadastrar cliente");
                            System.out.println("2. Buscar cliente");
                            System.out.println("3. Atualizar cliente");
                            System.out.println("4. Deletar cliente");
                            //melhorar o case 0
                            System.out.println("0. Voltar ao menu principal");
                            escolha = scanner.nextInt();
                            switch (escolha) {
                                case 1:

                                    System.out.println("Digite o nome do cliente:");
                                    ?.setName(scanner.next());
                                    System.out.println("Digite o CPF do cliente:");
                                    ?.setCpfCnpj(scanner.next());
                                    clienteController.add(?);
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar:");
                                    Cliente clienteGet = clienteController.get(scanner.next());
                                    System.out.println("Nome: " + clienteGet.getName());
                                    break;
                                case 3:
                                    System.out.println("Digite o novo nome do cliente:");
                                    ?.setName(scanner.next());
                                    clienteController.update(?);
                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        clienteController.delete(?);
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
                            escolha = scanner.nextInt();
                            switch (escolha) {
                                case 1:

                                    System.out.println("Digite o nome do cliente:");
                                    Gui1.setName(scanner.next());
                                    System.out.println("Digite o CPF do cliente:");
                                    Gui1.setCpfCnpj(scanner.next());
                                    funcionarioController.add(?);
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar:");
                                    Gui1.setCpfCnpj(scanner.next());
                                    funcionarioController.get(?.getCpfCnpj());
                                    break;
                                case 3:
                                    System.out.println("Digite o novo nome do cliente:");
                                    Gui1.setName(scanner.next());
                                    funcionarioController.update(?);
                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        funcionarioController.delete(?);
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
                                    ContaCredito ? = new ContaCredito("3", "3");
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
                                                ?.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                ?.setCpfCnpj(scanner.next());
                                                contaController.add(?);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                ?.setCpfCnpj(scanner.next());
                                                contaController.get(?.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                ?.setNumero(scanner.next());
                                                contaController.update(?);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(?);
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
                                    Contadebito ? = new Contadebito("3", "3");
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
                                                ?.setNumero(scanner.next());
                                                System.out.println("Digite o CPF do cliente:");
                                                ?.setCpfCnpj(scanner.next());
                                                contaController.add(?);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                guiDeb.setCpfCnpj(scanner.next());
                                                contaController.get(?.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                ?.setNumero(scanner.next());
                                                contaController.update(?);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(?);
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
                                                contaController.add(?);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                guiPou.setCpfCnpj(scanner.next());
                                                contaController.get(?.getCpfCnpj());
                                                break;
                                            case 3:
                                                System.out.println("Digite o novo número do cliente:");
                                                ?.setNumero(scanner.next());
                                                contaController.update(?);
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    contaController.delete(?);
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
                                                contaController.add(?);
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








