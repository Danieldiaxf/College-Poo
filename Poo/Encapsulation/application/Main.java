package Encapsulation.application;

import java.util.Scanner;

import javax.lang.model.element.Name;

import Encapsulation.entities.Produto;

public class Main {
    
    public static void main( String[ ] args ){

        Scanner sc = new Scanner( System.in );

        Produto produto = new Produto( "Computador", 2500, 3 );

        System.out.println( "Name: " + produto.getName() + "\nPrice: " + produto.getPrice() + "\n Quantity: " + produto.getQuantity() );

        sc.close();

    }


}
