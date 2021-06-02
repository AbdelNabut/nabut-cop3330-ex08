package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "How many people? " );
        int people = input.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = input.nextInt();
        System.out.print("How many slices are there in each pizza? ");
        int slicesInPizza = input.nextInt();
        int totalSlices = slicesInPizza * pizzas;
        int slicesPerPerson = totalSlices / people;
        System.out.printf("%d people with %d pizzas\n", people, pizzas);
        System.out.printf("Each person gets %d slices of pizza\n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.\n", totalSlices % people);
    }
}
