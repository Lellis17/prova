public class Professor extends Pessoa {

    private float salarioHora;
    private int horasAula;

    public Professor(float salarioHora, int horasAula) {
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public Professor(double v) {
        super();
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
    public void calcularSalario(float salarioHora){

    }
    public void mostrarProfessor(){

    }
}
