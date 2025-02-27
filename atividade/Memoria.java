public class Memoria extends Produto {

    private String capacidadeDeArmazenamento;

    public Memoria(String capacidadeDeArmazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [capacidadeDeArmazenamento=" + capacidadeDeArmazenamento + "]";
    }

}
