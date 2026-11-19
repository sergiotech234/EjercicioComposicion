public class Procesador {
    private int nucleos;

    public Procesador(int nucleos) {
        if (nucleos <= 0 ) {
            throw new IllegalArgumentException("El numero de nucleos debe ser mayor");
        }
        this.nucleos = nucleos;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}
