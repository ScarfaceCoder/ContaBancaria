public class Main {
    public static void main(String[] args) {

        // Criando uma instância de ContaCorrente
        ContaCorrente cc = new ContaCorrente(1, 0); // informando o número da conta(1) e em seguida o saldo inicial(0)

        // Sacando dinheiro da conta corrente
        cc.depositar(100);
        cc.sacar(10);

        // Imprimindo o saldo atual da conta corrente
        System.out.println("Saldo da conta corrente: R$" + cc.getSaldo());

        // Criando uma instância de ContaPoupanca
        ContaPoupanca cp = new ContaPoupanca(2, 0); // informando o número da conta(2) e em seguida o saldo inicial(0)

        // Depositando dinheiro na conta poupança
        cp.depositar(100);
        cp.sacar(10);

        // Imprimindo o saldo atual da conta poupança
        System.out.println("Saldo da conta poupança: R$" + cp.getSaldo());

    }
}
