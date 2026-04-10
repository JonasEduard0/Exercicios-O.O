package com.mycompany.orientaobjeto;
import java.util.Scanner;

public class OrientaObjeto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tecnico t1 = new Tecnico("Dorival Júnior", "Brasileiro", 1962);
        Tecnico t2 = new Tecnico("Abel Ferreira", "Português", 1978);

        Time time1 = new Time("Flamengo", "Rio de Janeiro", 1895);
        Time time2 = new Time("Palmeiras", "São Paulo", 1914);
        
        time1.setTecnico(t1.copiar());
        time2.setTecnico(t2.copiar());

        System.out.println(time1);
        System.out.println(time2);

        Tecnico t3 = new Tecnico("Tite", "Brasileiro", 1961);
        time1.setTecnico(t3.copiar());

        System.out.println("Depois da troca: ");
        System.out.println(time1);
        System.out.println(time2);
        
        sc.close();
    }
}
