public abstract class Produto {

    protected String marca;
    protected String modelo;
    protected double frequencia;
    protected String capacidadeDeArmazenamento;

    public Produto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Produto(String marca, String modelo, double frequencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }


    public Produto(String marca, String modelo, String capacidadeDeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }





}
