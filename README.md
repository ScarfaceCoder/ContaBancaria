O projeto Java simula um app de Conta Bancária onde temos a classe Conta como classepai e as classes ContaCorrente e ContaPoupanca herdando
seus atributos e métodos. 

Na classe pai (Conta) criamos métodos para depositar, sacar e visualizar saldo. Além desses 3 arquivos Java (Conta, ContaCorrente, ContaPoupanca)
temos também a classe Main onde instanciamos ContaCorrente e ContaPoupanca e realizamos os testes, depositar, sacar e visualizar saldo.

Em ContaCorrente criamos um método privado (aplicarJuros) onde toda vez que for feito um novo saque iremos subtrair uma unidade monetária do saldo 
da conta como taxa.

Em ContaPoupanca criamos um método privado (aplicarJuros) onde toda vez que for feito um novo depósito iremos adicionar uma unidade monetária no 
saldo da conta como juros.

Acredito que este projeto é capaz de demonstrar o aprendizado básico em Java contendo hierarquia de classes com herança, métodos de acesso, 
encapsulamento e métodos específicos para cada tipo de conta.
