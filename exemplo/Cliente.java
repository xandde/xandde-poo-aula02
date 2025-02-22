package exemplo;

public class Cliente extends Pessoa {

    private String dataDeCompra;
    private String formDePagamento;

    public Cliente(int idade, String nome, String dataDeCompra, String formDePagamento) {
        super(idade, nome);
        this.dataDeCompra = dataDeCompra;
        this.formDePagamento = formDePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormDePagamento() {
        return formDePagamento;
    }

    public void setFormDePagamento(String formDePagamento) {
        this.formDePagamento = formDePagamento;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", dataDeCompra=" + dataDeCompra + ", idade=" + idade + ", formDePagamento="
                + formDePagamento + "]";
    }

    
   
    

    

}
