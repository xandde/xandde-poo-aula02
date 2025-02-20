public class Cliente2 {
    private String nome;
    private String idade;
    private Pet2 pet;

    public Cliente2() {
    }

    public Cliente2(String nome, String idade, Pet2 pet) {
        this.nome = nome;
        this.idade = idade;
        this.pet = pet;
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

    public Pet2 getPet() {
        return pet;
    }

    public void setPet(Pet2 pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Cliente2 [nome=" + nome + ", idade=" + idade + ", pet=" + pet + "]";
    }


    
    

    
    


}
