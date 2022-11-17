public class Aluno extends Pessoa{
    private int ra;
    private String curso;
    private double nota1;
    private double nota2;
    private double media;
    public int faltas;
    public Aluno(String name, int idade,int ra, String curso, double nota1, double nota2,int faltas){
        super(name, idade);
        this.ra = ra;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2)/2;
        this.faltas = faltas;
    }

    public int getRa () {
        return ra;
    }

    public void setRa ( int ra ) {
        this.ra = ra;
    }

    public String getCurso () {
        return curso;
    }

    public void setCurso ( String curso ) {
        this.curso = curso;
    }

    public double getNota1 () {
        return nota1;
    }

    public void setNota1 ( double nota1 ) {
        this.nota1 = nota1;
    }

    public double getNota2 () {
        return nota2;
    }

    public void setNota2 ( double nota2 ) {
        this.nota2 = nota2;
    }

    public double getMedia () {
        return media;
    }

    public void setMedia ( double media ) {
        this.media = media;
    }
}
