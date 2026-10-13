public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thorin", 5, 200, 85, "Cota de Malla");
        Mago mago = new Mago("Gandalf", 8, 100, 120, "fuego");
        Arquero arquero = new Arquero("Legolas", 6, 120, 95, "Arco Élfico");

        System.out.println("=== Batalla RPG ===\n");

        System.out.println("-- Ronda 1: Ataques --");
        guerrero.atacar();
        System.out.println();
        mago.atacar();
        System.out.println();
        arquero.atacar();
        System.out.println();

        System.out.println("-- Ronda 2: Defensas --");
        guerrero.defender();
        mago.defender();
        arquero.defender();
        System.out.println();

        System.out.println("-- Daño recibido --");
        guerrero.recibirDanio(60);
        mago.recibirDanio(200);
        System.out.println();

        System.out.println("-- Estado final --");
        System.out.println(guerrero.toString());
        System.out.println(mago.toString());
        System.out.println(arquero.toString());
    }
}