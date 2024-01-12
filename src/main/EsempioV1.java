package main;

import implementazioni.Moltiplicatore;
import implementazioni.Sommatore;
import interfacce.Calculator;

public class EsempioV1 
{
    public static void main(String[] args) 
    {
        Calculator c1 = new Sommatore();
        Calculator c2 = new Moltiplicatore();
        System.out.println(c1.calcola(10, 20));
        System.out.println(c2.calcola(10, 20));
    }
}
