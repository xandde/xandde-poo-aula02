public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario motoboy = new Motoboy("João", "01/01/1990", Sexo.MASCULINO, Setor.RH, 1000.0, "123456");
        Funcionario diretor = new Diretor("Maria", "01/01/1980", Sexo.FEMININO, Setor.FINANCEIRO, 5000.0);
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        diretor.contratar(motoboy);
        diretor.demitir(motoboy);
    }
}
