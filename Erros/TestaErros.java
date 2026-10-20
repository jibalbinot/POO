package POO.Erros;

public class TestaErros {
    public static void main(String[] args) {
        int[] v = new int[5];//declarei um vetor
        int x;
        try{
          x = 10/2;
          v[12] = 33;
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
      
        System.out.println("finalizou");
    }
}
