// Classe que representa uma conta corrente, que herda da classe Conta
public class ContaCorrente extends Conta {

    // Construtor que recebe o número da conta e o saldo inicial
    public ContaCorrente(int contaNumero, float saldoInicial) {
        // Chama o construtor da superclasse para inicializar os atributos
        super(contaNumero, saldoInicial);
    }

    // Sobrescreve o método sacar para aplicar juros específicos da conta corrente
    @Override
    public void sacar(float valor){
        // Chama o método sacar da superclasse para efetuar o saque
        super.sacar(valor);
        // Aplica juros específicos da conta corrente
        this.aplicarJuros();
    }

    // Método privado para aplicar juros específicos da conta corrente
    private void aplicarJuros(){
        this.saldo -= 1; // Por exemplo, subtrai 1 unidade monetária como taxa
    }
}
