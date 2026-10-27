package POO;

class Conta {
    // Atributos de objeto
    private int numero;
    private Cliente titular = new Cliente(null, null);
    private double saldo;
    private double limite = 2000;

    // Atributo de classe
    private static int contador = 0;
    
    Conta() {
        this.numero = ++Conta.contador;
    }
    
    // Método de Classe - get para ler o valor do contador
    public static int getContador() {
        return Conta.contador;
    }

    void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    // Get
    double getLimite() {
        return limite;
    }
    
    // Set
    void setLimite(double valor) {
        if (isPositive(valor) && valor <= 5000) {
            limite = valor;
        } else {
            throw new ValorInvalidoException(valor);
        }
    }
    
    private boolean isPositive(double valor) {
        return (valor > 0);
    }
    
    void deposita(double valor) {
        if (isPositive(valor)) {
            saldo += valor;
        } else {
            throw new ValorInvalidoException(valor);
        }
    }
    
    void saca(double valor) {
        if (!isPositive(valor)) {
            throw new ValorInvalidoException(valor);
        }
        if (saldo + limite < valor) {
            throw new SaldoInsuficienteException(valor);
        }
        saldo -= valor;
    }

    void transfere(Conta destino, double valor) {
        // Se o saque falhar, a exceção é lançada e o depósito não ocorre
        this.saca(valor); 
        destino.deposita(valor);
    }

    void mostra() {
        System.out.println("------ Conta --------");
        System.out.println("Número.: " + this.numero);
        System.out.println("Titular: ");
        this.titular.mostra();
        System.out.println("Limite.: " + this.limite);
        System.out.println("Saldo..: " + this.saldo);
    }
}