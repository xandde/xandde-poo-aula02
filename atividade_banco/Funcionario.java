package atividade_banco;

public class Funcionario {
    private String codFunc;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Conta banco;
    
    public Funcionario() {
    }

    public Funcionario(String codFunc, String nome, String endereco, String telefone, String email, Conta banco) {
        this.codFunc = codFunc;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.banco = banco;
    }

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getBanco() {
        return banco;
    }

    public void setBanco(Conta banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Funcionario [codFunc=" + codFunc + ", nome=" + nome + ", endereco=" + endereco + ", telefone="
                + telefone + ", email=" + email + ", banco=" + banco + "]";
    }



}
