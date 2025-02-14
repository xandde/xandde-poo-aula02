package exemplo;
public class Main{
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Marta", 30, "xandde@gmail.com");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
    }
}
