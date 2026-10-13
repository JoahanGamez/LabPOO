public class Barco extends Vehiculo {
    private double eslora; // Longitud del barco
    private String tipoCasco;

    // Constructor
    public Barco(String marca, String modelo, int anio, double velocidadMax, double eslora, String tipoCasco) {
        super(marca, modelo, anio, velocidadMax);
        this.setEslora(eslora);
        this.tipoCasco = tipoCasco;
    }

    // Getters
    public double getEslora() {
        return eslora;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    // Setters
    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        } else {
            System.out.println("Error: la eslora debe ser mayor a 0 metros.");
        }
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEslora: " + eslora + " metros | Tipo de casco: " + tipoCasco;
    }
}