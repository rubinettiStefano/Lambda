package main;

import java.util.ArrayList;
import java.util.List;

import entita.Person;

public class EsempioStream 
{
    public static void main(String[] args) 
    {
        List<Person> jaita = new ArrayList<Person>();   
        jaita.add(new Person("Stefano", "Rubinetti", 28));
        jaita.add(new Person("Irene", "Alieksieieva", 28));  
        jaita.add(new Person("Luca", "Del Gatto", 30)); 
        jaita.add(new Person("Davide", "Bruschi", 28)); 
        jaita.add(new Person("Simone", "Di Muzio", 27)); 
        
        //Obiettivo
        //Ottenere la persona più giovane con il nome che inizi per S

        Person probabilmenteSimone =    jaita               //prendo la lista
                                        .stream()           //la trasformo in uno Stream, un insiemone con metodi belli
                                        .filter((p)->p.name.startsWith("S")) //Prendo tutte le persone che iniziano per S
                                        .sorted((p1,p2)-> p1.age-p2.age)//Le ordino dalla più giovane alla più vecchia
                                        .findFirst()//Prendo la prima
                                        .get();//lui non è sicuro di avercela, io gli dico c'è
        System.out.println(probabilmenteSimone);

        List<Person> conLaS =       jaita               //prendo la lista
                                    .stream()           //la trasformo in uno Stream, un insiemone con metodi belli
                                    .filter((p)->p.name.startsWith("S"))
                                    .toList(); //lo rifaccio divendare una lista

        List<String> soloNomi =     jaita
                                    .stream()
                                    .map(p->p.name)
                                    .toList();

        System.out.println(soloNomi);

    }
}
