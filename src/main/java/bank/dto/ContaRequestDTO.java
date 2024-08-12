package bank.dto;
//Record transforma todos os valores passados dentro de seu constructor como finais
public record ContaRequestDTO(String numeroConta, String cpfCnpj, double saldo) {}


// PRIMEIRO PASSO- criação da classe record e definido um xxxxx constructor que seria o mesmo que o metodo final, nesse caso foi o metodo de ADD
// portanto para funcionar precisa dos mesmos parametros do metodo add...