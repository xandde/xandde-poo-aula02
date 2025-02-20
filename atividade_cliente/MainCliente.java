package atividade_cliente;

public class MainCliente {
    public static void main(String[] args) {
        // Versão 1
        Endereco endereco1 = new Endereco("Salvador", "Rua A", "23");
        Cliente cliente1 = new Cliente(endereco1, "33", "Marta");

        // Versão 2
        // Cliente cliente2 = new Cliente("22", "Marlene");
        // new Endereco(cidade, logradouro, numero);
    }

}
