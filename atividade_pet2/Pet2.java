public class Pet2 {
    private String nome;
    private String idade;
    private String raca;

    public Pet2() {
    }

    public Pet2(String idade, String nome, String raca) {
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pet2 [nome=" + nome + ", idade=" + idade + ", raca=" + raca + "]";
    }




}
