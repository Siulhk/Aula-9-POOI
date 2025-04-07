package contas.java;

public class ContasApp {
    public static void main(String[] args) {
        Conta[] contas = new Conta[2];
        ContaEspecial contaEspecial = new ContaEspecial(1000);
        contas[0] = new Conta(1000);
        contas[1] = new Conta(2000);

        contas[0].sacar(contaEspecial.getSaldo(),500);
        contas[1].sacar(contaEspecial.getSaldo(),1000);
        contaEspecial.sacar(contaEspecial.getSaldo(),500);
        for (Conta c:contas){
            System.out.println("Saldo atual: "+ c.getSaldo());
            System.out.println();
        }
        System.out.println("Saldo atual: "+contaEspecial.getSaldo());
    }
}
