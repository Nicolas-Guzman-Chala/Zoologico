package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private String nit;
    private ArrayList<Animal> listaAnimales;

    public Zoologico(String nombre, String ubicacion, String nit) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaAnimales = new ArrayList<>();
    }

    //getter and setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getUbicacion() {return ubicacion;}

    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public String getNit() {return nit;}

    public void setNit(String nit) {this.nit = nit;}

    public ArrayList<Animal> getListaAnimales() {return listaAnimales;}

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {this.listaAnimales = listaAnimales;}

    //CRUD

    /**
     * Metodo para registrar un animal
     * @param animal
     * @return
     */
    public String registrarAnimal(Animal animal){

        String resultado = "";

        if(buscarAnimal(animal.getNombre()) == null){
            listaAnimales.add(animal);
            resultado = "El animal ha sido ingresado con exito";
        }else {
            resultado = "El animal ya existe";
        }

        return resultado;

    }

    /**
     * Metodo para buscar un animal por su nombre
     * @param nombre
     * @return
     */
    public Animal buscarAnimal(String nombre){
        for(Animal animal : listaAnimales){
            if(animal.getNombre().equals(nombre)){
                return animal;
            }
        }
        return null;
    }

    /**
     * Metodo para eliminar un animal de la lista de registrados
     * @param animal
     * @return
     */
    public String eliminarAnimal(Animal animal){

        String resultado = "";

        if(buscarAnimal(animal.getNombre()) != null){
            listaAnimales.remove(animal);
            resultado = "El animal ha sido eliminado con exito";
        }else {
            resultado = "El animal no existe";
        }
        return resultado;
    }

    /**
     * Metodo para actualizar el nombre de un animal
     * @param nombre
     */
    public void actualizarAnimal(String nombre){
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        animal = buscarAnimal(nombre);
        System.out.println("Por cual nombre quieres cambiar: ");
        String nuevoNombre = scanner.nextLine();
        if(animal != null){
            animal.setNombre(nombre);
            System.out.println("El nombre ha sido cambiado con exito");
        }else{
            System.out.println("El animal no existe");
        }
    }

    public void hacerSonidoTodos() {
        for (Animal animal : listaAnimales) {
            animal.hacerSonido(); // Polimorfismo en acción
        }
    }


}
