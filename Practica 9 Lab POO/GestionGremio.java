import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GestionGremio {
    private ArrayList<Personaje> roster;
    private LinkedList<String> colaTurnos;
    private HashMap<String, Integer> inventario;
    private HashSet<String> habilidades;

    public GestionGremio() {
        roster      = new ArrayList<>();
        colaTurnos  = new LinkedList<>();
        inventario  = new HashMap<>();
        habilidades = new HashSet<>();
    }

    // ArrayList
    public void agregarMiembro(Personaje p) {
        roster.add(p);
        System.out.println("[Gremio] " + p.getNombre() + " se unió al gremio.");
    }

    public void eliminarMiembro(String nombre) {
        Iterator<Personaje> it = roster.iterator();
        while (it.hasNext()) {
            Personaje p = it.next();
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                System.out.println("[Gremio] " + nombre + " abandonó el gremio.");
                return;
            }
        }
        System.out.println("[Gremio] No se encontró: " + nombre);
    }

    public Personaje buscarPorNombre(String nombre) {
        for (Personaje p : roster) {
            if (p.getNombre().equalsIgnoreCase(nombre)) return p;
        }
        return null;
    }

    public void mostrarRoster() {
        System.out.println("\n=== Roster del Gremio (" + roster.size() + " miembros) ===");
        for (int i = 0; i < roster.size(); i++) {
            Personaje p = roster.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " | Nivel: " + p.getNivel() + " | Vida: " + p.getPuntosVida());
        }
    }

    // LinkedList
    public void encolarSolicitante(String nombre) {
        colaTurnos.addLast(nombre);
        System.out.println("[Cola] " + nombre + " en posición " + colaTurnos.size());
    }

    public String atenderSiguiente() {
        if (colaTurnos.isEmpty()) return null;
        String atendido = colaTurnos.removeFirst();
        System.out.println("[Cola] Atendiendo a: " + atendido);
        return atendido;
    }

    public void mostrarCola() {
        System.out.println("\n=== Cola de Espera (" + colaTurnos.size() + ") ===");
        int pos = 1;
        for (String nombre : colaTurnos) System.out.println(pos++ + ". " + nombre);
    }

    // HashMap
    public void agregarItem(String item, int cantidad) {
        int cantidadActual = inventario.getOrDefault(item, 0);
        inventario.put(item, cantidadActual + cantidad);
        System.out.println("[Inventario] " + item + ": " + (cantidadActual + cantidad) + (cantidadActual > 0 ? " (acumulada)" : ""));
    }

    public void usarItem(String item) {
        if (inventario.containsKey(item) && inventario.get(item) > 0) {
            int restante = inventario.get(item) - 1;
            if (restante <= 0) inventario.remove(item);
            else inventario.put(item, restante);
            System.out.println("[Inventario] " + item + " usada. Restante: " + restante);
        } else {
            System.out.println("[Inventario] No existe en inventario: " + item);
        }
    }

    public void mostrarInventario() {
        System.out.println("\n=== Inventario del Gremio ===");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // HashSet
    public void registrarHabilidad(String habilidad) {
        if (habilidades.add(habilidad)) System.out.println("[Habilidades] " + habilidad + " registrada.");
        else System.out.println("[Habilidades] " + habilidad + " ya estaba registrada.");
    }

    public boolean tieneHabilidad(String habilidad) { return habilidades.contains(habilidad); }

    public void mostrarHabilidades() {
        System.out.println("\n=== Habilidades del Gremio ===");
        for (String habilidad : habilidades) System.out.println("- " + habilidad);
    }
}