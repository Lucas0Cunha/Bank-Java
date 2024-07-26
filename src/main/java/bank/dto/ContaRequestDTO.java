package bank.dto;
//Record transforma todos os valores passados dentro de seu constructor como finais
public record ContaRequestDTO(String numeroConta, String cpfCnpj, double saldo) {}
