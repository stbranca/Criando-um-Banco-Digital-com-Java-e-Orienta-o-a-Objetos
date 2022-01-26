package Project;

public class Main {

    public static void main(String[] args) {
        Cliente ElderMelo = new Cliente();
        ElderMelo.setNome("Elder Melo");

        Conta cc = new ContaCorrente(ElderMelo);
        Conta poupanca = new ContaPoupanca(ElderMelo);

        cc.depositar(2000);
        cc.transferir(160, poupanca);

        cc.impairExtractor();
        poupanca.impairExtractor();
    }

}