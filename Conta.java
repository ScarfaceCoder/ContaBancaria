// Classe abstrata que representa uma conta bancária
public abstract class Conta {

    // Atributos protegidos para encapsulamento
    protected float saldo;
    protected int contaNumero;

    // Construtor para inicializar o número da conta e o saldo inicial
    public Conta(int contaNumero, float saldoInicial) {
        this.contaNumero = contaNumero;
        this.saldo = saldoInicial;
    }

    // Método para sacar dinheiro da conta
    public void sacar(float valor){
        // Verifica se o valor é positivo e se há saldo suficiente na conta
        if (valor > 0 && this.saldo >= valor){
            // Se sim, subtrai o valor do saldo
            this.saldo -= valor;
        } else {
            // Se não, imprime uma mensagem de erro
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para depositar dinheiro na conta
    public void depositar(float valor){
        // Verifica se o valor é positivo
        if (valor > 0) {
            // Se sim, adiciona o valor ao saldo
            this.saldo += valor;
        } else {
            // Se não, imprime uma mensagem de erro
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para exibir o saldo da conta
    public void verSaldo(){
        System.out.println("Saldo = R$" + this.saldo);
    }

    // Métodos de acesso para o saldo e o número da conta
    public float getSaldo() {
        return saldo;
    }

    public int getContaNumero() {
        return contaNumero;
    }
}
