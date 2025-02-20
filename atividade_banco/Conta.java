package atividade_banco;

public class Conta {
    private String banco;
    private String agencia;
    private String numConta;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDisponivel;

    public Conta() {
    }

    public Conta(String banco, String agencia, String numConta, String tipoConta, double saldoAtual,
            double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "Conta [banco=" + banco + ", agencia=" + agencia + ", numConta=" + numConta + ", tipoConta=" + tipoConta
                + ", saldoAtual=" + saldoAtual + ", limiteDisponivel=" + limiteDisponivel + "]";
    }

    

    


}
