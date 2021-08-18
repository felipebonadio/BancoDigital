public class Main {
    public static void main(String[] args) {

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Conta cc= new ContaCorrente(felipe);
        Conta cp= new ContaPoupanca(felipe);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
