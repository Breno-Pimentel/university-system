import java.util.ArrayList;

public class Disciplina implements DefineDiscplina {
    public String nomeDisciplina;
    public int codigoDisciplina;
    public int cargaHoraria;
    public int total=0;

//Arraylist de alunos da disciplina
    ArrayList<Aluno> ListaAlunos = new ArrayList<Aluno>();
    //Arraylist de professores da disciplina
    ArrayList<Professor> ListaProfessor = new ArrayList<>();


    public Disciplina ( String nomeDisciplina, int codigoDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = cargaHoraria;


    }

    public void addAluno(Aluno obj){
        ListaAlunos.add(obj);
    }

    @Override
    public boolean aprovadoFalta (Aluno obj) {
        boolean aprovado = false;
        if (obj.faltas < maxFaltas) {
            aprovado = true;
        }
        return aprovado;
    }

    @Override
    public boolean aprovadoNota(Aluno obj){
        boolean aprovado = false;
        if(obj.getMedia() >= mediaAprovado){
            aprovado = true;
        }
        return aprovado;
    }

    @Override
    public void mostrarDados () {

    }
}
