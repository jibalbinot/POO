package POO;

class Conta{
  //atributos de objeto
  private int numero;
  private Cliente titular = new Cliente(null, null);
  private double saldo;
  private double limite = 2000;

  //atributo de classe
  private static int contador = 0;
  
  
  Conta(){
    this.numero = ++Conta.contador;
  }
  
  // método de Classe - get para ler o valor do contador
  public static int getContador(){
    return Conta.contador;
  }


  void setTitular(Cliente titular){
    this.titular = titular;
  }
  
  //get
  double getLimite(){
    return limite;
  }
  //set
  void setLimite(double valor){
    if(isPositive(valor)&&valor<=5000){
        limite = valor;
    } else {
      System.out.println("Valor invalido");
    }
  }
  
  private boolean isPositive(double valor){
     return (valor>0);
  }
  
  void deposita(double valor){
    if(isPositive(valor)){
      saldo += valor;
    } else {
      System.out.println("Valor inválido");
    }
  }
  boolean saca(double valor){
    if(isPositive(valor)){
      if(saldo+limite >= valor){
        saldo -= valor;
        return true;
      } else {
        System.out.println("Saldo R$ "+saldo+
        " é insuficiente para o saque de R$ "+valor);
      }
    } else {
      System.out.println("Valor inválido");
    }
    return false;
  }

  void transfere(Conta destino, double valor){
    if(this.saca(valor)){ //saca da origem
      destino.deposita(valor);//deposita no destino
    }
  }


  void mostra(){
    System.out.println("------ Conta --------");
    System.out.println("Número.: " + this.numero);
		System.out.println("Titular: ");
    this.titular.mostra();
		System.out.println("Limite.: " + this.limite);
		System.out.println("Saldo..: " + this.saldo);
  }
}