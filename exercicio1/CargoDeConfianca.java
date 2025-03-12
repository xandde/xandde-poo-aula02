
public abstract class CargoDeConfianca extends Funcionario {

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataDoNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDoNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }





}
