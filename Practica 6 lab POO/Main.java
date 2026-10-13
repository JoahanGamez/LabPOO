public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Expansión: Nuevas Clases ===\n");

        System.out.println("-- Error esperado (línea comentada) --");
        System.out.println("// Personaje p = new Personaje(\"X\", 1, 100); // cannot instantiate abstract class\n");

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, "Lobo");
        Nigromante nigromante = new Nigromante("Malachar", 6, 350, 220, 15);
        Bardo bardo = new Bardo("Finnian", 5, 150, 60, "laúd");

        Personaje[] equipo = { druida, nigromante, bardo };

        System.out.println("-- Ataques y daño --");
        for (Personaje p : equipo) {
            p.atacar();
            System.out.println("Daño: " + p.calcularDanio());
        }
        System.out.println();

        System.out.println("-- Solo los Hechiceros lanzan hechizos --");
        for (Personaje p : equipo) {
            if (p instanceof Hechicero h) {
                h.lanzarHechizo();
            }
        }
        System.out.println();

        System.out.println("-- Solo los Sanadores curan --");
        nigromante.recibirDanio(300);
        for (Personaje p : equipo) {
            if (p instanceof Sanador s) {
                s.curarAliado(nigromante);
            }
        }
        System.out.println();

        System.out.println("-- Estado final --");
        for (Personaje p : equipo) {
            System.out.println(p.toString());
        }
    }
}