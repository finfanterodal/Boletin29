package boletin29;

/**
 *
 * @author finfanterodal
 */
public abstract class Barcos {

    //
    private String matricula = "";
    private int eslora = 0;
    private float precioAluguer = 0;
    //

    public Barcos() {
    }

    public Barcos(String matricula, int eslora, float precioAluguer) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.precioAluguer = precioAluguer;
    }
    //

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public float getPrecioAluguer() {
        return precioAluguer;
    }

    public void setPrecioAluguer(float precioAluguuer) {
        this.precioAluguer = precioAluguuer;
    }
    //

    @Override
    public String toString() {
        return "matricula=" + matricula + ", eslora=" + eslora + ", precioAluguer=" + precioAluguer;
    }
    
    
    
}
