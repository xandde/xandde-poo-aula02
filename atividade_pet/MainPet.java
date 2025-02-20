
import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {    
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome do pet: ");
        String nome = ler.next();

        System.out.println("Qual a alimentaçao do seu pet: ");
        String alimentacao = ler.next();

        Pet pet1 = new Pet(alimentacao, "Pitbull", 1, nome, "grande");

        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Alimentação: " + pet1.getAlimentacao());
       
        
}
}
