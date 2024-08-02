package bank.gui;

import bank.controller.ClienteController;
import bank.controller.ContaController;
import bank.controller.FuncionarioController;
import bank.exceptions.ClienteJaExisteException;
import bank.exceptions.ClienteNaoExisteException;
import bank.exceptions.ClienteRegraDeNegocio;
import bank.models.*;

import java.util.Scanner;

public class ClienteGui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Perguntar qual a vantagem disso nesses casos, n entendi tao bem
        ContaController contaController = new ContaController();


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
                                    Cliente cliente = new Cliente();
                                    System.out.println("Digite o nome do cliente:");
                                    cliente.setName(scanner.next());
                                    System.out.println("Digite o CPF do cliente:");
                                    cliente.setCpfCnpj(scanner.next());
                                    clienteController.add(cliente);
                                    //TODO TRATAR ADD DUPLO
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar: ");
                                    try {
                                        Cliente clienteGet = clienteController.get(scanner.next());
                                        System.out.println(clienteGet.toString());

                                    } catch (ClienteNaoExisteException e) {
                                        System.out.println(e.getMessage());
                                    }

                                    break;
                                case 3:

                                    System.out.println("Digite o CPF do cliente que deseja buscar: ");
                                    try {
                                        Cliente clienteGet = clienteController.get(scanner.next());
                                        System.out.println("Digite o novo nome do cliente:");
                                        clienteGet.setName(scanner.next());
                                        clienteController.update(clienteGet);
                                        System.out.println("Cliente atualizado com sucesso!");
                                    } catch (ClienteRegraDeNegocio e) {
                                        System.out.println(e.getMessage());
                                    }


                                    break;
                                case 4:
                                    System.out.println("Digite o CPF do cliente que deseja delete: ");
                                    Cliente get = null;
                                    try {
                                        get = clienteController.get(scanner.next());
                                        clienteController.delete(get);
                                        System.out.println("Cliente deletado com sucesso!");
                                    } catch (ClienteNaoExisteException e) {
                                        System.out.println(e.getMessage());
                                    }

                                    break;
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
                                    Funcionario funcionario = new Funcionario();
                                    System.out.println("Digite o nome do cliente:");
                                    try {
                                        funcionario.setName(scanner.next());
                                        System.out.println("Digite o CPF do cliente:");
                                        funcionario.setCpfCnpj(scanner.next());
                                        funcionarioController.add(funcionario);
                                    } catch (ClienteJaExisteException e) {
                                        e.getMessage();
                                    }

                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar: ");
                                    try {
                                        Funcionario funcionarioGet = funcionarioController.get(scanner.next());
                                        System.out.println(funcionarioGet.toString());
                                    } catch (ClienteNaoExisteException e) {
                                        e.getMessage();
                                    }
                                case 3:
                                    System.out.println("Digite o CPF do funcionario que deseja alterar: ");
                                    try {
                                        Funcionario funcionarioGet = funcionarioController.get(scanner.next());
                                        System.out.println("Digite um novo nome do funcionário: ");
                                        funcionarioGet.setName(scanner.next());
                                        funcionarioController.update(funcionarioGet);
                                    } catch (ClienteRegraDeNegocio e) {
                                        e.getMessage();
                                    }


                                    break;
                                case 4:

                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        try {
                                            Funcionario funcionarioGet = funcionarioController.get(scanner.next());
                                            funcionarioController.delete(funcionarioGet);
                                        } catch (ClienteRegraDeNegocio e) {
                                            e.getMessage();
                                        }

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

                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");
                                        //PQ PRECISO ADICIONAR NOVAMENTE UMA OPCAO E N POSSO USAR A ANTERIOR
                                        int opcao2 = scanner.nextInt();

                                        switch (opcao2) {
                                            case 1:
                                                System.out.println("Digite o número da conta: ");
                                                ContaCredito contaCredito = new ContaCredito();
                                                contaCredito.setNumero(scanner.next());
                                                System.out.println("Digite o CPF/CNPJ da conta: ");
                                                contaCredito.setCpfCnpj(scanner.next());
                                                contaController.add(contaCredito);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                try {
                                                    contaCredito = new ContaCredito();
                                                    Conta contacredget = contaController.get(contaCredito.getCpfCnpj());
                                                    System.out.println(contacredget.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    e.getMessage();
                                                }

                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    contaCredito = new ContaCredito();
                                                    Conta contacredget = contaController.get(contaCredito.getCpfCnpj());
                                                    contacredget.setNumero(scanner.next());
                                                    contaController.update(contacredget);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        contaCredito = new ContaCredito();
                                                        Conta contacredget = contaController.get(contaCredito.getCpfCnpj());
                                                        contaController.delete(contacredget);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        e.getMessage();
                                                    }
                                                }break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                scanner.close();
                                                return; // Encerra o loop e o programa
                                            default:
                                                System.out.println("Opção inválida! Digite um número de 0 a 4.");
                                                break;
                                        }

                                    }

                                case 2:
                                    //ERRADO


                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");
                                        int opcao3 = scanner.nextInt();
                                        switch (opcao3) {
                                            case 1:
                                                System.out.println("Digite o número da conta: ");
                                                ContaDebito contaDebito = new ContaDebito();
                                                contaDebito.setNumero(scanner.next());
                                                System.out.println("Digite o CPF/CNPJ da conta: ");
                                                contaDebito.setCpfCnpj(scanner.next());
                                                contaController.add(contaDebito);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                try {
                                                    //TODO PQ ISSO FUNCIONA
                                                    contaDebito = new ContaDebito();
                                                    Conta contaDebGet = contaController.get(contaDebito.getCpfCnpj());
                                                    System.out.println(contaDebGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    contaDebito = new ContaDebito();
                                                    Conta contaDebGet = contaController.get(contaDebito.getCpfCnpj());
                                                    contaDebGet.setNumero(scanner.next());
                                                    contaController.update(contaDebGet);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        contaDebito = new ContaDebito();
                                                        Conta contaDebGet = contaController.get(contaDebito.getCpfCnpj());
                                                        contaController.delete(contaDebGet);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        e.getMessage();
                                                    }
                                                }break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                scanner.close();
                                                return; // Encerra o loop e o programa
                                            default:
                                                System.out.println("Opção inválida! Digite um número de 0 a 4.");
                                                break;
                                        }
                                    }


                                case 3:


                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");
                                        int opcao4 = scanner.nextInt();
                                        switch (opcao4) {
                                            case 1:
                                                System.out.println("Digite o número da conta: ");
                                                ContaPoupanca contaPoupanca = new ContaPoupanca();
                                                contaPoupanca.setNumero(scanner.next());
                                                System.out.println("Digite o CPF/CNPJ da conta: ");
                                                contaPoupanca.setCpfCnpj(scanner.next());
                                                contaController.add(contaPoupanca);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                try {
                                                    //TODO PQ ISSO FUNCIONA
                                                    contaPoupanca = new ContaPoupanca();
                                                    Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                    System.out.println(contaPouGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    contaPoupanca = new ContaPoupanca();
                                                    Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                    contaPouGet.setNumero(scanner.next());
                                                    contaController.update(contaPouGet);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        contaPoupanca = new ContaPoupanca();
                                                        Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                        contaController.delete(contaPouGet);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        e.getMessage();
                                                    }
                                                }break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                scanner.close();
                                                return;
                                            default:
                                                System.out.println("Opção inválida! Digite um número de 0 a 4.");
                                                break;
                                        }
                                    }

                                case 4:



                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Cadastrar cliente");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");

                                        int opcao5 = scanner.nextInt();
                                        switch (opcao5) {
                                            case 1:
                                                System.out.println("Digite o número da conta: ");
                                                ContaSalario contaSalario = new ContaSalario();
                                                contaSalario.setNumero(scanner.next());
                                                System.out.println("Digite o CPF/CNPJ da conta: ");
                                                contaSalario.setCpfCnpj(scanner.next());
                                                contaController.add(contaSalario);
                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                try {
                                                    //TODO PQ ISSO FUNCIONA
                                                    contaSalario = new ContaSalario();
                                                    Conta contaSalGet = contaController.get(contaSalario.getCpfCnpj());
                                                    System.out.println(contaSalGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    contaSalario = new ContaSalario();
                                                    Conta contaSalGet = contaController.get(contaSalario.getCpfCnpj());
                                                    contaSalGet.setNumero(scanner.next());
                                                    contaController.update(contaSalGet);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    e.getMessage();
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        contaSalario = new ContaSalario();
                                                        Conta contaSalGet = contaController.get(contaSalario.getCpfCnpj());
                                                        contaController.delete(contaSalGet);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        e.getMessage();
                                                    }
                                                }break;
                                            case 0:
                                                System.out.println("Saindo...");
                                                scanner.close();
                                                return;
                                            default:
                                                System.out.println("Opção inválida! Digite um número de 0 a 4.");
                                                break;
                                        }


                                    }
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                                    break;
                            }
                        }

                }


            } finally {
                System.out.println("Fim da aplicação");
            }
        }


    }


}








