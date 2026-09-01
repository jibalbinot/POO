package POO.Heranca;

public class TestaHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Jeysonn",45);
        p.mostra();

        Funcionario f = new Funcionario("Joaquim",60,35000);
        f.mostra();
    }
}
