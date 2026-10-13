public class Avion extends Vehiculo {
    private String aerolinea;
    private double altitudMaxima;

    // Constructor
    public Avion(String marca, String modelo, int anio, double velocidadMax, String aerolinea, double altitudMaxima) {
        super(marca, modelo, anio, velocidadMax);
        this.aerolinea = aerolinea;
        this.setAltitudMaxima(altitudMaxima);
    }

    // Getters
    public String getAerolinea() {
        return aerolinea;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    // Setters
    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        if (altitudMaxima > 0) {
            this.altitudMaxima = altitudMaxima;
        } else {
            System.out.println("Error: la altitud máxima debe ser mayor a 0.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAerolínea: " + aerolinea + " | Altitud Máxima: " + altitudMaxima + " pies";
    }
}