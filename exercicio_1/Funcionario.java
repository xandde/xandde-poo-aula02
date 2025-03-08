public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String dataDoNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataDoNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDoNascimento = dataDoNascimento;
        this.salarioBase = salarioBase;
    }


    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatDoNascimento() {
        return dataDoNascimento;
    }

    public void setDatDoNascimento(String dataDoNascimento) {
        this.dataDoNascimento = dataDoNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
