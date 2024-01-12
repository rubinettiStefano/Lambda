package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entita.Person;
import implementazioni.ComparatorePerEta;

public class EsempioOrdinamento 
{
    public static void main(String[] args) 
    {
        List<Person> jaita = new ArrayList<Person>();   
        jaita.add(new Person("Stefano", "Rubinetti", 28));
        jaita.add(new Person("Irene", "Alieksieieva", 28));  
        jaita.add(new Person("Luca", "Del Gatto", 30)); 
        jaita.add(new Person("Davide", "Bruschi", 28)); 
        jaita.add(new Person("Simone", "Di Muzio", 27)); 

        System.out.println(jaita);
        System.out.println("-----------------------------------------");

        Collections.sort(jaita);
        System.out.println(jaita);
        System.out.println("-----------------------------------------");
        //Ordino per età
        // Comparator<Person> eta = new ComparatorePerEta();
        // Collections.sort(jaita,eta);
        // System.out.println(jaita);
        // System.out.println("-----------------------------------------");
        // Comparator<Person> eta = new Comparator<Person>()
        //                             {
        //                                 @Override
        //                                 public int compare(Person p1,Person p2)
        //                                 {
        //                                     return p1.age-p2.age;
        //                                 }
        //                             };

        // Collections.sort(jaita,eta);
        // System.out.println(jaita);
        // System.out.println("-----------------------------------------");

        Comparator<Person> eta = (p1,p2) -> {return p1.age-p2.age;};
        Comparator<Person> eta2 = (p1,p2) ->  p1.age-p2.age;

        // Collections.sort(jaita,eta2);
        // System.out.println(jaita);
        // System.out.println("-----------------------------------------");
        // Collections.sort(jaita,(p1,p2) ->  p1.age-p2.age);
        // System.out.println(jaita);
        // System.out.println("-----------------------------------------");
        Collections.sort(jaita,(p1,p2) ->  p2.age-p1.age);
        System.out.println(jaita);
        System.out.println("-----------------------------------------");

    }
}
