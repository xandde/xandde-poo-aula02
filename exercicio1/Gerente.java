
public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataDoNascimento, double salarioBase) {
        super(nome, cpf, dataDoNascimento, salarioBase, Bonificacao.GERENTE);
    }
    
    @Override
    public double obterSalarioFinal() {
        return getSalarioBase() * this.bonificacao.getBonificacao();
    }
    
    @Override
    public void contratar(Funcionario funcionario) {
        System.out.println("Contratando funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDoNascimento='" + dataDoNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", bonificacao=" + bonificacao +
                '}';
    }


}
