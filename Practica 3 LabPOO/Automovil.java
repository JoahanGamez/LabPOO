public class Automovil extends Vehiculo {
    private int numPuertas;
    private boolean esElectrico;

    // Constructor
    public Automovil(String marca, String modelo, int anio, double velocidadMax, int numPuertas, boolean esElectrico) {
        super(marca, modelo, anio, velocidadMax);
        this.setNumPuertas(numPuertas);
        this.esElectrico = esElectrico;
    }

    // Getters
    public int getNumPuertas() {
        return numPuertas;
    }

    public boolean isElectrico() {
        return esElectrico;
    }

    // Setters
    public void setNumPuertas(int n) {
        if (n >= 2 && n <= 6) {
            this.numPuertas = n;
        } else {
            System.out.println("Error: número de puertas no válido.");
        }
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override
    public String toString() {
        String tipoMotor = esElectrico ? "Sí" : "No";
        return super.toString() + "\nPuertas: " + numPuertas + " | Eléctrico: " + tipoMotor;
    }
}