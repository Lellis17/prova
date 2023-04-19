public class Aluno extends Pessoa{
    private int periodo;
    private int turma;

    public Aluno(int pediodo, int turma) {
        this.periodo = pediodo;
        this.turma = turma;
    }

    public int getPediodo() {
        return periodo;
    }

    public void setPediodo(int pediodo) {
        this.periodo = pediodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
    public void mostrarAluno(){

    }
}
