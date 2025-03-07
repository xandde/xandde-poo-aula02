public class Motoboy extends Funcionario {

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String datDoNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiraDeHabilitacao) {
        super(nome, datDoNascimento, sexo, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioBase();
    }
}
