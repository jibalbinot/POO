package POO.Heranca;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade =idade;
    }

    public void mostra(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
}
