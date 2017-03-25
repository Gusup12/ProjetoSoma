package modelo;

public class Controle
{

    public String resultado;

    public Controle(String num1, String num2)
    {
        Validacao val = new Validacao();
        val.num1 = num1;
        val.num2 = num2;

        if (val.valida())
        {
            resultado = val.mensagem;
        }
        else
        {
            Somar soma = new Somar(val.n1, val.n2);
            
            resultado = String.valueOf(soma.res);
        }
    }

}
