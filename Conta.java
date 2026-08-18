package POO;

class Conta{
  //atributos
  private int numero;
  private String titular;
  private double saldo;
  private double limite = 2000;
  
  //métodos
  void setNumero(int numero){
    this.numero = numero; //atributo recebe o valor do parâmetro
  }
  void setTitular(String titular){
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
  void saca(double valor){
    if(isPositive(valor)){
      if(saldo+limite >= valor){
        saldo -= valor;
      } else {
        System.out.println("Saldo R$ "+saldo+
        " é insuficiente para o saque de R$ "+valor);
      }
    } else {
      System.out.println("Valor inválido");
    }
  }
  void mostra(){
    System.out.println("------ Conta --------");
    System.out.println("Número.: " + this.numero);
		System.out.println("Titular: " + this.titular);
		System.out.println("Limite.: " + this.limite);
		System.out.println("Saldo..: " + this.saldo);
  }
}