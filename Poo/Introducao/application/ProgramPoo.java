package application;

import java.util.Scanner;
import entities.TrianguloPoo;

public class ProgramPoo {

    public static void main( String[ ] args ) {

        Scanner sc = new Scanner( System.in );

        TrianguloPoo triangulo = new TrianguloPoo(  );

        triangulo.setL1(3);
        triangulo.setL2(4);
        triangulo.setL3(5);

        System.out.println( triangulo.area( ) );

        sc.close();
    }
}