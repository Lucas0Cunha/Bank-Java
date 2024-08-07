package bank.gui;

import bank.controller.ClienteController;
import bank.controller.ContaController;
import bank.controller.FuncionarioController;
import bank.exceptions.ClienteJaExisteException;
import bank.exceptions.ClienteNaoExisteException;
import bank.exceptions.ClienteRegraDeNegocio;
import bank.models.*;
import bank.util.TipoConta;


import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaController contaController = new ContaController();

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
                                    bank.models.Cliente cliente = new bank.models.Cliente();
                                    try {
                                        System.out.println("Digite o nome do cliente:");
                                        cliente.setName(scanner.next());
                                        System.out.println("Digite o CPF do cliente:");
                                        cliente.setCpfCnpj(scanner.next());
                                        clienteController.add(cliente);
                                    } catch (ClienteJaExisteException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do cliente que deseja buscar: ");
                                    try {
                                        bank.models.Cliente clienteGet = clienteController.get(scanner.next());
                                        System.out.println(clienteGet.toString());

                                    } catch (ClienteNaoExisteException e) {
                                        System.out.println(e.getMessage());
                                    }

                                    break;
                                case 3:

                                    System.out.println("Digite o CPF do cliente que deseja buscar: ");
                                    try {
                                        bank.models.Cliente clienteGet = clienteController.get(scanner.next());
                                        System.out.println("Digite o novo nome do cliente:");
                                        clienteGet.setName(scanner.next());
                                        clienteController.update(clienteGet);
                                        System.out.println("Cliente atualizado com sucesso!");
                                    } catch (ClienteRegraDeNegocio e) {
                                        System.out.println(e.getMessage());
                                    }


                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        System.out.println("Digite o CPF do cliente que deseja deletar: ");
                                        bank.models.Cliente get = null;
                                        try {
                                            get = clienteController.get(scanner.next());
                                            clienteController.delete(get);
                                            System.out.println("Cliente deletado com sucesso!");
                                        } catch (ClienteNaoExisteException e) {
                                            System.out.println(e.getMessage());
                                        }
                                    } else {
                                        break;
                                    }
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
                                        System.out.println("Funcionário cadastrado com sucesso!");
                                    } catch (ClienteJaExisteException e) {
                                        System.out.println(e.getMessage());
                                    }

                                    break;
                                case 2:
                                    System.out.println("Digite o CPF do funcionário que deseja buscar: ");
                                    try {
                                        Funcionario funcionarioGet = funcionarioController.get(scanner.next());
                                        System.out.println(funcionarioGet.toString());
                                    } catch (ClienteRegraDeNegocio e) {
                                        System.out.println(e.getMessage());
                                    }

                                    break;
                                case 3:
                                    System.out.println("Digite o CPF do funcionario que deseja alterar: ");
                                    try {
                                        Funcionario funcionarioGet = funcionarioController.get(scanner.next());
                                        System.out.println("Digite um novo nome do funcionário: ");
                                        funcionarioGet.setName(scanner.next());
                                        funcionarioController.update(funcionarioGet);
                                        System.out.println("Funcionário atualizado com sucesso!");
                                    } catch (ClienteRegraDeNegocio e) {
                                        System.out.println(e.getMessage());
                                    }


                                    break;
                                case 4:
                                    System.out.println("Você tem certeza que quer deletar sua conta");
                                    if (scanner.next().equalsIgnoreCase("Sim")) {
                                        System.out.println("Digite o CPF do funcionário que deseja deletar: ");
                                        Funcionario get = null;
                                        try {
                                            get = funcionarioController.get(scanner.next());
                                            funcionarioController.delete(get);
                                            System.out.println("Funcionário deletado com sucesso!");
                                        } catch (ClienteNaoExisteException e) {
                                            System.out.println(e.getMessage());
                                        }
                                    } else {
                                        break;
                                    }

                                    break;
                                case 0:
                                    System.out.println("Saindo...");
                                    next = false;


                                    System.out.println("Opção inválida! Digite um número de 1 a 5.");
                                    break;
                            }
                        }
                    case 3:
                        //TODO METODO DE TIPO DE CONTA AUTOMATICO
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
                                    Thread tarefa = new Thread(() -> {
                                        while (true) {
                                            try {
                                                Thread.sleep(20000); // Espera 10 segundos
                                                System.out.println("Você está na conta de tipo "+TipoConta.CREDITO);

                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                System.out.println("A tarefa de fundo foi interrompida.");
                                            }
                                        }
                                    });

                                    // Inicia a thread
                                    tarefa.setDaemon(true); // A thread será encerrada quando a aplicação principal for encerrada
                                    tarefa.start();

                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Criar conta crédito");
                                        System.out.println("2. Buscar conta");
                                        System.out.println("3. Atualizar conta");
                                        System.out.println("4. Deletar conta");
                                        System.out.println("0. Voltar ao menu principal");

                                        int opcao2 = scanner.nextInt();

                                        switch (opcao2) {
                                            case 1:
                                                try {
                                                    ContaCredito contaCredito = new ContaCredito();
                                                    System.out.println("Digite o número do seu cartão de crédito: ");
                                                    contaCredito.setNumero(scanner.next());

                                                    System.out.println("Digite o CPF/CNPJ da conta: ");
                                                    contaCredito.setCpfCnpj(scanner.next());

                                                    // Solicitar o saldo
                                                    System.out.println("Digite o seu total saldo em conta: ");
                                                    double saldo = scanner.nextDouble();
                                                    double limite = contaController.calcularLimite(saldo);

                                                    contaController.add(contaCredito);

                                                    System.out.println("Conta criada com sucesso!");
                                                    System.out.println("O seu limite em conta é de: " + limite);
                                                } catch (ClienteNaoExisteException e) {
                                                    System.out.println(e.getMessage() + ", antes de você criar uma conta tipo crédito, precisa ser nosso cliente.");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("Digite o número da conta que deseja buscar:");

                                                //TODO COMO FAÇO PARA SEREM A MSM CONTA AGR
                                                try {
                                                    ContaCredito contaCredito = new ContaCredito();
                                                    double numeroConta = contaCredito.getSaldo();
                                                    //AQUI PRECISA DAR O GET DA CONTA CADASTRADA
                                                    Conta conta = contaController.get(scanner.next());

                                                    if (conta != null) {
                                                        System.out.println("Conta encontrada:");
                                                        System.out.println(conta.toString());


                                                        double saldo = contaController.getSaldo(String.valueOf(numeroConta));


                                                        double limite = contaController.calcularLimite(saldo);

                                                        System.out.println("O limite do seu cartão é de: " + limite);
                                                    } else {
                                                        System.out.println("Conta não encontrada.");
                                                    }

                                                } catch (ClienteNaoExisteException e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    ContaCredito contaCredito = new ContaCredito();
                                                    Conta contacredget = contaController.get(contaCredito.getCpfCnpj());
                                                    contacredget.setNumero(scanner.next());
                                                    contaController.update(contacredget);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        ContaCredito contaCredito = new ContaCredito();
                                                        Conta contacredget = contaController.get(contaCredito.getCpfCnpj());
                                                        contaController.delete(contacredget);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        System.out.println(e.getMessage());
                                                    }
                                                } else {
                                                    break;
                                                }
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
                                    Thread tarefadeb = new Thread(() -> {
                                        while (true) {
                                            try {
                                                Thread.sleep(20000); // Espera 10 segundos
                                                System.out.println("Você está na conta de tipo "+TipoConta.DEBITO);

                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                System.out.println("A tarefa de fundo foi interrompida.");
                                            }
                                        }
                                    });

                                    // Inicia a thread
                                    tarefadeb.setDaemon(true); // A thread será encerrada quando a aplicação principal for encerrada
                                    tarefadeb.start();

                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Criar conta débito");
                                        System.out.println("2. Buscar conta");
                                        System.out.println("3. Atualizar conta");
                                        System.out.println("4. Deletar conta");
                                        System.out.println("0. Voltar ao menu principal");
                                        int opcao3 = scanner.nextInt();
                                        switch (opcao3) {
                                            case 1:
                                                //deixei de tratar para verficar o pq funciona na linha 310
                                                System.out.println("Digite o número da conta: ");
                                                Conta contaDebito = new ContaDebito();
                                                contaDebito.setNumero(scanner.next());
                                                System.out.println("Digite o CPF/CNPJ da conta: ");
                                                contaDebito.setCpfCnpj(scanner.next());
                                                contaController.add(contaDebito);
                                                break;
                                            case 2:
                                                System.out.println("Digite o numero da conta do cliente que deseja buscar:");
                                                try {
                                                    Conta contaDebGet = contaController.get(scanner.next());
                                                    System.out.println(contaDebGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    System.out.println(e.getMessage());
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
                                                    System.out.println(e.getMessage());
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
                                                        System.out.println(e.getMessage());
                                                    }
                                                } else {
                                                    break;
                                                }
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
                                    Thread tarefapou = new Thread(() -> {
                                        while (true) {
                                            try {
                                                Thread.sleep(20000); // Espera 10 segundos
                                                System.out.println("Você está na conta de tipo "+TipoConta.POUPANCA);

                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                System.out.println("A tarefa de fundo foi interrompida.");
                                            }
                                        }
                                    });

                                    // Inicia a thread
                                    tarefapou.setDaemon(true); // A thread será encerrada quando a aplicação principal for encerrada
                                    tarefapou.start();

                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Criar conta poupança");
                                        System.out.println("2. Buscar cliente");
                                        System.out.println("3. Atualizar cliente");
                                        System.out.println("4. Deletar cliente");
                                        System.out.println("0. Voltar ao menu principal");
                                        int opcao4 = scanner.nextInt();
                                        switch (opcao4) {
                                            case 1:
                                                try {
                                                    System.out.println("Digite o número da conta: ");
                                                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                                                    contaPoupanca.setNumero(scanner.next());
                                                    System.out.println("Digite o CPF/CNPJ da conta: ");
                                                    contaPoupanca.setCpfCnpj(scanner.next());
                                                    contaController.add(contaPoupanca);
                                                } catch (ClienteJaExisteException e) {
                                                    System.out.println(e.getMessage());
                                                }

                                                break;
                                            case 2:
                                                System.out.println("Digite o CPF do cliente que deseja buscar:");
                                                try {
                                                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                                                    Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                    System.out.println(contaPouGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                break;
                                            case 3:
                                                System.out.println("Digite o número da conta que deseja alterar");
                                                try {
                                                    ContaPoupanca contaPoupanca = new ContaPoupanca();
                                                    Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                    contaPouGet.setNumero(scanner.next());
                                                    contaController.update(contaPouGet);
                                                } catch (ClienteRegraDeNegocio e) {
                                                    System.out.println(e.getMessage());
                                                }
                                                break;
                                            case 4:
                                                System.out.println("Você tem certeza que quer deletar sua conta");
                                                if (scanner.next().equalsIgnoreCase("Sim")) {
                                                    try {
                                                        ContaPoupanca contaPoupanca = new ContaPoupanca();
                                                        Conta contaPouGet = contaController.get(contaPoupanca.getCpfCnpj());
                                                        contaController.delete(contaPouGet);
                                                        System.out.println("Conta deletada com sucesso!");
                                                    } catch (ClienteRegraDeNegocio e) {
                                                        System.out.println(e.getMessage());
                                                    }
                                                } else {
                                                    break;
                                                }
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
                                    Thread tarefasal = new Thread(() -> {
                                        while (true) {
                                            try {
                                                Thread.sleep(20000); // Espera 10 segundos
                                                System.out.println("Você está na conta de tipo "+TipoConta.SALARIO);

                                            } catch (InterruptedException e) {
                                                Thread.currentThread().interrupt();
                                                System.out.println("A tarefa de fundo foi interrompida.");
                                            }
                                        }
                                    });

                                    // Inicia a thread
                                    tarefasal.setDaemon(true); // A thread será encerrada quando a aplicação principal for encerrada
                                    tarefasal.start();

                                    while (true) {
                                        System.out.println("Escolha a operação:");
                                        System.out.println("1. Criar conta salário");
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

                                                    contaSalario = new ContaSalario();
                                                    Conta contaSalGet = contaController.get(contaSalario.getCpfCnpj());
                                                    System.out.println(contaSalGet.toString());
                                                } catch (ClienteNaoExisteException e) {
                                                    System.out.println(e.getMessage());
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
                                                    System.out.println(e.getMessage());
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
                                                        System.out.println(e.getMessage());
                                                    }
                                                } else {
                                                    break;
                                                }
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








