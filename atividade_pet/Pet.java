public class Pet {

    private String nome;
    private int idade;
    private String breed;
    private String porte;
    private String alimentacao;

    public Pet(String alimentacao, String breed, int idade, String nome, String porte) {
        this.alimentacao = alimentacao;
        this.breed = breed;
        this.idade = idade;
        this.nome = nome;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }


}
