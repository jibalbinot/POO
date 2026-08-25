package POO;

public class Cliente {
    
    //construtor
    //Cliente(){
    //    System.out.println("Construtor 01");
    // }
    //private Cliente(String nome){
    //    System.out.println("Construtor 02");
    //    this.nome = nome;
    // }
    Cliente(String nome, String cpf){
        //this(nome); //uns construtor pode chamar outro constutor
        System.out.println("Construtor único");
        this.nome = nome;
        this.cpf = cpf;
    }
    
    
    //atributos
    private String cpf;
    private String nome;
    
    //métodos
    public String getCPF() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: "+this.cpf);
    }
}
