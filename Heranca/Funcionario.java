package POO.Heranca;

public class Funcionario extends Pessoa{
    private double salario;

    //construtor
    public Funcionario(String nome, int idade, double salario){
        super(nome, idade); //chama o construtor da super classe
        this.salario = salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void mostra(){
       super.mostra();
        System.err.println("Salario: "+this.salario);
    }
    
}
