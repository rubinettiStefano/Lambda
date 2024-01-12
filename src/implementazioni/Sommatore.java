package implementazioni;

import interfacce.Calculator;

public class Sommatore implements Calculator
{

    @Override
    public int calcola(int a, int b) 
    {
        return a+b;
    }

}
