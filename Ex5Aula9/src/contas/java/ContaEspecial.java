package contas.java;

public class ContaEspecial extends Conta{
    public ContaEspecial(double saldo){
        super(saldo);
    }
    @Override
    public double getTaxa() {
        return 0.01;
    }
}
