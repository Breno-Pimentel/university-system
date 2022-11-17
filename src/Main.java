public class Main {
    public static void main ( String[] args ) {

        //Instanciando objetos da classe disciplina
        Disciplina di1 = new Disciplina("Programação",123,130);
        Disciplina di2 = new Disciplina("Modelagem de Software", 321,  90);

        //Instanciando objetos da classe Aluno
        Aluno a1 = new Aluno("Breno", 19,12222222, "Programação",10, 4,14);
        Aluno a2 = new Aluno("Damon", 32, 12999999, "Modelagem de Software", 10, 10, 17);
        Aluno a3 = new Aluno("Stephan", 23, 1288888, "Modelagem de Software", 3, 8, 10);

        //Instanciando objetos da classe Professor;
        Professor p1 = new Professor(1800.00,"Jonas", 60);
        Professor p2 = new Professor(5000.00, "Pablo", 45);
        Professor p3 = new Professor(16000, "Jake Peralta",73);
        //Adcionando objetos de Aluno dentro da minha arrayList
        di1.ListaAlunos.add(a2);
        di2.ListaAlunos.add(a1);
        di2.ListaAlunos.add(a3);
        //Adcionando obejtos da classe professor dentro da Arraylist de professores
        di1.ListaProfessor.add(p1);
        di2.ListaProfessor.add(p2);
        di2.ListaProfessor.add(p3);
        //Trazendo as informações do aluno e da Disciplina di1 - Progrmação
        for (int i =0;i < di1.ListaAlunos.size();i++){
            System.out.println("Disciplina: " + di1.nomeDisciplina);
            System.out.println("Professor: " + di1.ListaProfessor.get(i).getName());
            System.out.println("Aluno: " + di1.ListaAlunos.get(i).getName() );
            System.out.println("Media final: " + di1.ListaAlunos.get(i).getMedia());
            di1.aprovadoNota(di1.ListaAlunos.get(i));
            di1.aprovadoFalta(di1.ListaAlunos.get(i));

            //Exibição da situação do aluno utilizando os metodo de aprovaçao de aluno como condição
            if(di1.aprovadoFalta(di1.ListaAlunos.get(i)) && di1.aprovadoNota(di1.ListaAlunos.get(i))){
                System.out.println("Aluno aprovado\n");
            }
            else if(!di1.aprovadoFalta(di1.ListaAlunos.get(i))) {
                System.out.println("Aluno reprovado por falta!\n");
            }
            else if(!di1.aprovadoNota(di1.ListaAlunos.get(i))) {
                System.out.println("Aluno reprovado - Não atingiu a media esperada!\n");
            }
            else{
                System.out.println("Aluno reprovado!\n");
            }
        }

        //Trazendo as informações do aluno e da discplina di2 - Modelagem de Software
        for(int i = 0; i < di2.ListaAlunos.size();i++){
            System.out.println("Disciplina: " + di2.nomeDisciplina);
            System.out.println("Professor:" + di2.ListaProfessor.get(i).getName());// Professor da Disciplina
            System.out.println("Aluno: " + di2.ListaAlunos.get(i).getName()); //Traz o nome
            System.out.println("Media final: " + di2.ListaAlunos.get(i).getMedia()); //Traz a media final
            di2.aprovadoFalta(di2.ListaAlunos.get(i)); //metodo de aprovação por falta, passando como parametro os objetos da classe Aluno
            di2.aprovadoNota(di2.ListaAlunos.get(i)); //metodo de aprovação por nota, passando como parametro os objetos da classe Aluno

            // Se essas condicoes forem true por padrao ela ira mostrar aprovado, caso contrário, mostrará reprovado
            if(di2.aprovadoFalta(di2.ListaAlunos.get(i)) && di2.aprovadoNota(di2.ListaAlunos.get(i))){
                System.out.println("Aluno aprovado\n");
            }
            else if(!di2.aprovadoFalta(di2.ListaAlunos.get(i))) {
                System.out.println("Aluno reprovado por falta!\n");
            }
            else if(!di2.aprovadoNota(di2.ListaAlunos.get(i))) {
                System.out.println("Aluno reprovado - Não atingiu a media esperada!\n");
            }
            else{
                System.out.println("Aluno reprovado!\n");
            }
        }



    }
}