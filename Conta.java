public class Conta {
    private float saldo;
    private int numConta;
    private Pessoa titular;
    private int tipoConta;

    public void verificaSaque(float valorSaque) {

    }

    public void verificaDeposito(float valor) {
        
    }

    public void verificaTransferencia(Conta contaDestino, float valor) {

    }

    // get e set

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

}