package POO;

public class Cliente {
    
    private String cpf;
    private String nome;
    
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
