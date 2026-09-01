package POO.Heranca;

public class TestaHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Jeysonn Isaac Balbinot");
        p.setIdade(45);
        p.mostra();

        Funcionario f = new Funcionario();
        f.setNome("Joaquim Barbosa");
        f.setIdade(60);
        f.setSalario(35000);
        f.mostra();
    }
}
