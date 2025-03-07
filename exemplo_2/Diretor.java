public class Diretor extends Funcionario implements Contratacao{

    private final double PREMIO = 0.2

    public Diretor(String nome, String datDoNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, datDoNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        return super.getSalarioBase() + super.getSalarioBase() * PREMIO;
    }

    @Override
    public void contratar(Funcionario funcionario) {
        System.out.println("Contratando funcionário: " + funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionário: " + funcionario.getNome());
    }
}
