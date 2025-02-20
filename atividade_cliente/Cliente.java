package atividade_cliente;

public class Cliente {
    private String nome;
    private String idade;
    private Endereco endereco;

    public Cliente() {
    } 

    public Cliente(Endereco endereco, String idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
    }

   
    

}
