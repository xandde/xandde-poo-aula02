public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(2.4);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getBonificacao() {
        return valor;
    }

}
