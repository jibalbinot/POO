package POO.Colecoes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestaColecoes {
    public static void main(String[] args) {
        //variável comum
        int x = 10;
        System.out.println(x);

        //vetor
        int[] v = new int[5];
        v[0] = 45;
        v[1] = 37;
        v[2] = 12;
        v[3] = 66;
        v[4] = 12;
        System.out.print("v: ");
        for(int i=0 ; i < 5 ; i++ ){
            System.out.print(v[i]+" ");
        }
        System.out.println();


        //vetor dinâmico - ArrayList
        ArrayList vd = new ArrayList();
        vd.add(45);
        vd.add(37);
        vd.add(12);
        vd.add("Maria");
        vd.add(9.87);
        vd.add(66);
        vd.add("Jeysonn");
        vd.add(12);
        vd.add(false);
        System.out.println(vd);
        vd.remove(0);
        System.out.println(vd);
        System.out.println(vd.size());
        System.out.println(vd.contains("Jeysonn2"));
        System.out.println(vd.get(3));

    }
}
