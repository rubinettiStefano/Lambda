package implementazioni;

import java.util.Comparator;

import entita.Person;

public class ComparatorePerEta implements Comparator<Person>
{

    //deve restituire 1 quando o1 > o2
    //0 quando o1==o2
    //-1 quando o1<o2
    @Override
    public int compare(Person o1, Person o2) 
    {
        return o1.age-o2.age;
    }

}
