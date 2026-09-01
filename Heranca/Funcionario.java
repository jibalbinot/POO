package POO.Heranca;

public class Funcionario extends Pessoa{
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void mostra(){
       super.mostra();
        System.err.println("Salario: "+this.salario);
    }
    
}
