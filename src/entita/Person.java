package entita;

public class Person implements Comparable<Person>
{
    public String name,surname;
    public int age;

    public Person(){}

    

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public String toString()
    {
        return name+" "+surname + " age: "+age+"\n";
    }

    @Override
    public int compareTo(Person o) 
    {
        return name.compareTo(o.name);//abbiamo detto che di base ordiniamo le persone
        //in ordine alfabetico
    }
}
