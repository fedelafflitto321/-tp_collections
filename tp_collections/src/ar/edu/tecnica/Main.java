package ar.edu.tecnica;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        EjemploFrutas ejemplo = new EjemploFrutas();
        
        // List
        ejemplo.ejemploList();
        
        // Set
        ejemplo.ejemploSet();
        
        // Map
        ejemplo.ejemploMap();
        
        // Queue
        ejemplo.ejemploQueue();
        
        // Deque
        ejemplo.ejemploDeque();
        
        // Sort
        ejemplo.ejemploSort();
        
        // Reverse
        ejemplo.ejemploReverse();
        
        // Shuffle
        ejemplo.ejemploShuffle();
        
        // Swap
        ejemplo.ejemploSwap();
        
        // Fill
        ejemplo.ejemploFill();
        
        // Min
        ejemplo.ejemploMinMax();
    }
}

class EjemploFrutas {

    public void ejemploList() {
        List<String> frutas = new ArrayList<>(Arrays.asList(
            "Manzana", "Banana", "Cereza", "Durazno", "Uva"));
        System.out.println("Contenido de la lista de frutas: " + frutas);
    }

    public void ejemploSet() {
        Set<String> frutas = new HashSet<>(Arrays.asList(
            "Manzana", "Banana", "Cereza", "Durazno", "Uva"));
        System.out.println("Contenido del set de frutas: " + frutas);
    }

    public void ejemploMap() {
        Map<String, Integer> frutasConCalorias = new HashMap<>();
        frutasConCalorias.put("Manzana", 52); // Baja caloría
        frutasConCalorias.put("Banana", 89); // Moderada
        frutasConCalorias.put("Cereza", 50); // Baja
        frutasConCalorias.put("Durazno", 39); // Muy baja
        frutasConCalorias.put("Uva", 69); // Moderada
        System.out.println("Contenido del mapa de frutas con calorías: " + frutasConCalorias);
    }

    public void ejemploQueue() {
        Queue<String> cola = new LinkedList<>(Arrays.asList(
            "Manzana", "Banana", "Cereza"));
        System.out.println("Contenido de la cola (Queue): " + cola);
    }

    public void ejemploDeque() {
        Deque<String> deque = new ArrayDeque<>(Arrays.asList(
            "Manzana", "Banana", "Cereza", "Durazno", "Uva"));
        System.out.println("Contenido de la deque: " + deque);
    }

    public void ejemploSort() {
        List<String> frutas = new ArrayList<>(Arrays.asList(
            "Manzana", "Banana", "Cereza", "Durazno", "Uva"));
        Collections.sort(frutas);
        System.out.println("Lista de frutas ordenada: " + frutas);
    }

    public void ejemploReverse() {
        List<String> frutas = new ArrayList<>(Arrays.asList(
            "Manzana", "Banana", "Cereza", "Durazno", "Uva"));
        Collections.reverse(frutas);
        System.out.println("Lista de frutas revertida: " + frutas);
    }

    public void ejemploShuffle() {
        List<String> frutas = new ArrayList<>(Arrays.asList(
            "Manzana", "Banana", "Cereza"));
        Collections.shuffle(frutas);
        System.out.println("Lista de frutas mezclada: " + frutas);
    }

    public void ejemploSwap() {
        List<String> lista = new ArrayList<>(Arrays.asList("Manzana", "Banana"));
        Collections.swap(lista, 0, 1);
        System.out.println("Lista después de swap: " + lista);
    }

    public void ejemploFill() {
        List<String> lista = new ArrayList<>(Arrays.asList("Fruta 1", "Fruta 2", "Fruta 3"));
        Collections.fill(lista, "Fruta Genérica");
        System.out.println("Lista después de fill: " + lista);
    }

    public void ejemploMinMax() {
        Map<String, Integer> frutasConCalorias = new HashMap<>();
        frutasConCalorias.put("Manzana", 52);
        frutasConCalorias.put("Banana", 89);
        frutasConCalorias.put("Cereza", 50);
        frutasConCalorias.put("Durazno", 39);
        frutasConCalorias.put("Uva", 69);
        
        // Encontrar la fruta con menor y mayor cantidad de calorías
        String frutaMin = null;
        String frutaMax = null;
        int minCalorias = Integer.MAX_VALUE;
        int maxCalorias = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : frutasConCalorias.entrySet()) {
            if (entry.getValue() < minCalorias) {
                minCalorias = entry.getValue();
                frutaMin = entry.getKey();
            }
            if (entry.getValue() > maxCalorias) {
                maxCalorias = entry.getValue();
                frutaMax = entry.getKey();
            }
        }

        System.out.println("La fruta con menor cantidad de calorías es: " + frutaMin + " con " + minCalorias + " calorías.");
        System.out.println("La fruta con mayor cantidad de calorías es: " + frutaMax + " con " + maxCalorias + " calorías.");
    }
}

