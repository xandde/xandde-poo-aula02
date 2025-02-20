package atividade_veiculo;

public class Veiculo {

    String placa;
    String cor;
    int numPassageiro;
    double capTanque;
    int velocidadeMax;
    double consMedio;

    // Constructor
    public Veiculo(String placa, String cor, int numPassageiro, double capTanque, int velocidadeMax, double consMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiro = numPassageiro;
        this.capTanque = capTanque;
        this.velocidadeMax = velocidadeMax;
        this.consMedio = consMedio;
    }

    // Getters and Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(char placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPassageiro() {
        return numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    public double getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(double capTanque) {
        this.capTanque = capTanque;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getConsMedio() {
        return consMedio;
    }

    public void setConsMedio(double consMedio) {
        this.consMedio = consMedio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veiculo{");
        sb.append("placa=").append(placa);
        sb.append(", cor=").append(cor);
        sb.append(", numPassageiro=").append(numPassageiro);
        sb.append(", capTanque=").append(capTanque);
        sb.append(", velocidadeMax=").append(velocidadeMax);
        sb.append(", consMedio=").append(consMedio);
        sb.append('}');
        return sb.toString();
    }
    
}
