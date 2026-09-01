package POO.Heranca;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //métodos getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade =idade;
    }
    public int getIdade(){
        return this.idade;
    }

    //métodos variados
    public void mostra(){
        System.out.println("NOME: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
}
