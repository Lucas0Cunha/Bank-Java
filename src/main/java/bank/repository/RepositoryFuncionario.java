package bank.repository;

import bank.models.Funcionario;
import bank.repository.impl.FuncionarioDAOImpl;

public class RepositoryFuncionario {
    public static void main(String[] args) {
        FuncionarioDAO funcionario = new FuncionarioDAOImpl();
        Funcionario a1 = new Funcionario("5511","Lucas");
        Funcionario a2 = new Funcionario("7474","Luis");
        Funcionario a3 = new Funcionario("8585","Pedro");
        Funcionario a4 = new Funcionario("9696","Maria");
        funcionario.adiciona(a1);
        funcionario.adiciona(a2);
        funcionario.adiciona(a3);
        funcionario.adiciona(a4);

        funcionario.infoDaConta(a3);
        System.out.println(funcionario.contem("5511"));

        //errado
        System.out.println(funcionario.pega("5511"));




    }
}
