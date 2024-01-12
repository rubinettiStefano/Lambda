package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entita.Person;

public class EsempioFiltroUniversale 
{
    public static void main(String[] args) 
    {
        List<Person> jaita = new ArrayList<Person>();   
        jaita.add(new Person("Stefano", "Rubinetti", 28));
        jaita.add(new Person("Irene", "Alieksieieva", 28));  
        jaita.add(new Person("Luca", "Del Gatto", 30)); 
        jaita.add(new Person("Davide", "Bruschi", 28)); 
        jaita.add(new Person("Simone", "Di Muzio", 27));  
        
        //Voglio tutte le persone di 28 anni
        // List<Person> giovaniDentro = filter(jaita,(p)->p.age==28);

        // System.out.println(giovaniDentro);
        //System.out.println(getPeopleWithAge(jaita, 28));
        Predicate<Person> pre = (p)-> 
                                {
                                    int a =28; 
                                    return p.age==a && p.name.startsWith("S"); 
                                };
        List<Person> inizaSe28Anni = filter(jaita,pre);
        System.out.println(inizaSe28Anni);
    }

    //Predicate è una interfaccia funzionale che ha il metodo test
    // public boolean test(T t);
    //prende un oggetto come parametro e da un boolean

    private static List<Person> getPeopleWithAge(List<Person> in, int age)
    {
        return filter(in,(p)->p.age==age);
    }

    

    private static List<Person> filter(List<Person> in,Predicate<Person> predicate)
    {
        List<Person> res = new ArrayList<Person>();

        for(Person p: in)
            if(predicate.test(p))//se la persona passa il test del Predicate allora viene aggiunta alla lista
                res.add(p);
    
        return res;
    }
}
