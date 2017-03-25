package modelo;

public class Somar
{

    private int n1;
    private int n2;
    public int res;

    public Somar(int num1, int num2)
    {
        this.n1 = num1;
        this.n2 = num2;
        this.res = Soma(); 

    }

    private int Soma()
    {
        return this.n1 + this.n2;
    }

}
