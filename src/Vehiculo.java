import java.io.Serializable;

class Vehiculo implements Serializable {

    private int potencia;
    private String matricula;
    private int marchas;
    public Vehiculo(){
    }

    Vehiculo(int potencia, String matricula, int marchas) {
        this.potencia = potencia;
        this.matricula = matricula;
        this.marchas = marchas;
    }
    public void cambio_de_marcha(){
        System.out.println("Cambiando de marcha");
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getMarchas() {
        return marchas;
    }
    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "potencia=" + potencia +
                ", matricula='" + matricula + '\'' +
                ", marchas=" + marchas +
                '}';
    }
}