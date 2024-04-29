// Classe que representa uma conta poupança, que herda da classe Conta
public class ContaPoupanca extends Conta{

    // Construtor que recebe o número da conta e o saldo inicial
    public ContaPoupanca(int contaNumero, float saldoInicial) {
        // Chama o construtor da superclasse para inicializar os atributos
        super(contaNumero, saldoInicial);
    }

    // Sobrescreve o método depositar para aplicar juros específicos da conta poupança
    @Override
    public void depositar(float valor){
        // Chama o método depositar da superclasse para efetuar o depósito
        super.depositar(valor);
        // Aplica juros específicos da conta poupança
        this.aplicarJuros();
    }

    // Método privado para aplicar juros específicos da conta poupança
    private void aplicarJuros(){
        this.saldo += 1; // Por exemplo, adiciona 1 unidade monetária como juros
    }
}