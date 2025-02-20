package atividade_banco;

public class MainConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Itaú", "001", "8535", "corrente", 00.00, 100);
        Funcionario funcionario1 = new Funcionario("ub15983", "Alexsandro", "Massaranduba", "990", "alexsandro@gmail", conta1);
        System.out.println(funcionario1.toString());
    }

}
