import java.util.ArrayList;

public class Professor extends Pessoa{
    private double salario;
    


    public double getSalario () {
        return salario;
    }

    public void setSalario ( double salario ) {
        this.salario = salario;
    }

    public Professor ( double salario, String name, int idade ) {
        super(name, idade);
        this.salario = salario;
    }
}
