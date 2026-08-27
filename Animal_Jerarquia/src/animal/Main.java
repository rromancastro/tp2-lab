
package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---1. CREADO Y POBLADO DE HASHMAP---");
        HashMap<Integer, Animal> mapaAnimales = new HashMap <> ();
        
        Animal perro1 = new Perro(1, "Roco", "balanceado", "Casa", "Ovejero");
        Animal perro2 = new Perro(2, "Bobby", "carne", "Patio", "Chihuahua");
        Animal perro3 = new Perro(3, "Colita", "balanceado", "Casa", "Bulldog");
        
        Animal lobo1 = new Lobo(4, "Colmillo Blanco", "carne fresca", "Bosque");
        Animal lobo2 = new Lobo(5, "Shadow", "carne fresca", "Tundra");
        
        Animal gato1 = new Gato(6, "Tom", "pescado", "Departamento", 0.3, 5);
        Animal gato2 = new Gato(7, "Garfield", "lasaña", "Casa", 0.25, 2);
        
        Animal leon1 = new Leon(8, "Simba", "carne", "Sabana", 1.2, 15);
        Animal tigre1 = new Tigre(1.1, 18, 9, "Tigre de Bengala", "carne", "Selva");
        
        mapaAnimales.put(0, perro1);
        mapaAnimales.putIfAbsent(1, perro2);
        mapaAnimales.put(2, perro3);
        mapaAnimales.put(3, lobo1);
        mapaAnimales.put(4, lobo2);
        mapaAnimales.put(5, gato1);
        mapaAnimales.put(6, gato2);
        mapaAnimales.put(7, leon1);
        mapaAnimales.put(8, tigre1);
        
        System.out.println("\n--- Animales recuperados del HashMap (entrySet) ---");
        for (Map.Entry<Integer, Animal> entry : mapaAnimales.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " -> " + entry.getValue());
        }
        
         System.out.println("\n--- 2. FILTRANDO PERROS A UN ARRAYLIST ---");
        ArrayList<Perro> listaPerros = new ArrayList<>();
        for (Animal animal : mapaAnimales.values()) {
            if (animal instanceof Perro) {
                listaPerros.add((Perro) animal);
            }
        }
        
         Collections.sort(listaPerros);
                 System.out.println("Perros guardados y ordenados alfabéticamente por raza:");
        for (Perro p : listaPerros) {
            System.out.println(p);
        }
        
        System.out.println("\n--- 3. BÚSQUEDA Y ELIMINACIÓN CON ITERATOR ---");
        System.out.print("Ingrese el nombre (especie) del perro que desea eliminar: ");
        String perroAEliminar = teclado.nextLine();

        Iterator<Perro> iterador = listaPerros.iterator();
        boolean encontrado = false;

        while (iterador.hasNext()) {
            Perro p = iterador.next();
            
            if (p.getEspecie().equalsIgnoreCase(perroAEliminar)) {
                iterador.remove(); 
                encontrado = true;
                System.out.println("¡El perro '" + perroAEliminar + "' fue encontrado y eliminado de la lista!");
            }
        

        if (!encontrado) {
            System.out.println("El perro '" + perroAEliminar + "' no se encuentra en la lista.");
        }
    }
        System.out.println("\nLista final de perros ordenada:");
        for (Perro p : listaPerros) {
            System.out.println(p);
    }
        System.out.println("\n--- 4. GATOS A HASHSET Y SALVAJES A UN ARREGLO ---");
        
        HashSet<Gato> conjuntoGatos = new HashSet<>();
    
        int cantSalvajes = 0;
        
            for (Animal animal : mapaAnimales.values()) {
                if (animal instanceof Gato) {
                    conjuntoGatos.add((Gato) animal);
                } else if (animal instanceof Lobo || animal instanceof Leon || animal instanceof Tigre) {
                    cantSalvajes++;
            }
            }
        Animal[] arregloSalvajes = new Animal[cantSalvajes];
        
        int indiceArreglo = 0;
        
            for (Animal animal : mapaAnimales.values()) {
                 
                if (animal instanceof Lobo || animal instanceof Leon || animal instanceof Tigre) {
                    arregloSalvajes[indiceArreglo] = animal;
                    indiceArreglo++;
                
                System.out.println("Gatos en el HashSet (no admiten duplicados y no tienen orden específico):");
        for (Gato g : conjuntoGatos) {
            System.out.println(g);
        }
            
            System.out.println("\n--- EXTRAS: Pruebas de comportamiento y polimorfismo ---");
        System.out.println(">> Probando el aullido dinámico del Lobo:");
        lobo1.hacerRuido(); 
        
        System.out.println("\n>> Probando las vueltas del Perro al dormir:");
        perro1.dormir(); 
        
        System.out.println("\n>> Probando el salto del León (solicitará velocidad):");
        leon1.hacerRuido(); 
        ((Leon) leon1).saltar(); 
        }
        }
        }
}


