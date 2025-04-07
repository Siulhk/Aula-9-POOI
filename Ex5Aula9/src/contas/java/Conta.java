package contas.java;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo=saldo;
    }
    public void depositar(double saldo,int x){
        this.saldo = saldo+x;
    }
    public void sacar(double saldo,int x){
        this.saldo -=x+(x*getTaxa());
    }
    public double getTaxa(){
        return 0.02;
    }
    public double getSaldo(){
        return saldo;
    }
}
