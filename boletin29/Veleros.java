package boletin29;

/**
 *
 * @author finfanterodal
 */
public class Veleros extends Barcos {

    //
    int numMastiles = 0;
    //

    public Veleros() {
    }

    public Veleros(int numMastiles, String matricula, int eslora, float precioAluguer) {
        super(matricula, eslora, precioAluguer);
        this.numMastiles = numMastiles;
    }

}
