package modelo;

public class Validacao
{

    public String num1;
    public String num2;
    public String mensagem;

    public int n1;
    public int n2;

    public boolean valida()
    {
        boolean teste = false;
        this.mensagem = "";
        try
        {
            this.n1 = Integer.parseInt(this.num1);
            teste = false;
        }
        catch (NumberFormatException nfe)
        {
            mensagem = "Erro no campo 1!\n";
            teste = true;
        }
        try
        {
            this.n2 = Integer.parseInt(this.num2);
           
        }
        catch (NumberFormatException nfe)
        {
            mensagem += "Erro no campo 2!";
            teste = true;
        }
        return teste;
    }
}
