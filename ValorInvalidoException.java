package POO;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(double valor){
        super("O valor " + valor+" é negativo e não permitido");
    }
}
