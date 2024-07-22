package bank.study;

import bank.models.Funcionario;
import bank.repository.FuncionarioDAO;
import bank.repository.impl.FuncionarioDAOImpl;

public class RepositoryFuncionario {
    public static void main(String[] args) {
        FuncionarioDAO funcionario = new FuncionarioDAOImpl();
        Funcionario a1 = new Funcionario("5511","Lucas");
        Funcionario a2 = new Funcionario("7474","Luis");
        Funcionario a3 = new Funcionario("8585","Pedro");
        Funcionario a4 = new Funcionario("9696","Maria");
        funcionario.add(a1);
        funcionario.add(a2);
        funcionario.add(a3);
        funcionario.add(a4);

        System.out.println(funcionario.toString());
        System.out.println(funcionario.contem("5511"));


        System.out.println(funcionario.get("5511"));




    }
}
