package app;

import model.*;

public class Aplicacion {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("Mi Zoo", "Bogotá", "12345");

        Gato gato1 = new Gato("Michi");
        Pato pato1 = new Pato("Donald");
        Perro perro1 = new Perro("Firulais");
        Rana rana1 = new Rana("Pepe");
        Raton raton1 = new Raton("Jerry");

        System.out.println(zoo.registrarAnimal(gato1));
        System.out.println(zoo.registrarAnimal(pato1));
        System.out.println(zoo.registrarAnimal(perro1));
        System.out.println(zoo.registrarAnimal(rana1));
        System.out.println(zoo.registrarAnimal(raton1));

        System.out.println("\n--- Animales haciendo sonidos ---");
        zoo.hacerSonidoTodos();

        System.out.println("\n--- Eliminando un animal ---");
        System.out.println(zoo.eliminarAnimal(gato1));

        System.out.println("\n--- Animales después de eliminar ---");
        zoo.hacerSonidoTodos();
    }
}
