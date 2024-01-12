package main;

import interfacce.Calculator;

public class EsempioV2 
{
    public static void main(String[] args) 
    {
        Calculator c1   = new Calculator()
                            {
                                @Override
                                public int calcola(int pippo,int pluto)
                                {
                                    return pippo-pluto;
                                }
                            };
        //la parte a destra dell'uguale si legge
        //Crea una Classe ANONIMA (senza nome, usa e getta)
        //che implementa l'interfaccia Calculator
        //e che ha come codice l'override del metodo calcola
        //dopodichè ISTANZIALA
        //e assegna la sua istanza alla variabile c1
        System.out.println(c1.calcola(30, 10));

        Calculator c2 = (a,b) -> {return a-b;} ;//la riga 25 è EQUIVALENTE
        //alle righe dalla 9 alla 16
        System.out.println(c2.calcola(30, 10));

        //1) Calculator è un INTERFACCIA FUNZIONALE
        //2) Una classe che lo implementa dovrà fare override di un solo metodo
        //3) quando facciamo override di un metodo:
        //      -- Il tipo di ritorno non può essere cambiato
        //      -- I parametri NON possono essere cambiati di numero o tipo, ma posso cambiare il nome
        //      -- Il corpo del metodo va scritto da 0


        
        Calculator c3 =                 (a,b) -> 
                                        {
                                            int res = a-b;
                                            return res;
                                        };


        Calculator c4 = (a,b) -> /*return*/a-b;                                
        //sintassi chiamata LAMBDA
        //Una sintassi concisa per fare OVERRIDE dell'unico metodo astratto di una interfaccia funzionale
        //fa quello sopra
        //e instanzia automaticamente un oggetto di una classe anonima che implementa quell'interfaccia
    }
}
