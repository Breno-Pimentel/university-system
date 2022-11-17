public interface DefineDiscplina {
    public int maxFaltas = 15;
    public double mediaAprovado = 6;
    public boolean aprovadoNota(Aluno obj);
    public boolean aprovadoFalta(Aluno obj);
    public void mostrarDados();
}
