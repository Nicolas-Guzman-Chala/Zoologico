package model;

public class Gato extends Animal {

    public Gato(String nombre){
        super(nombre);
    }

    //polimorfismo

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "dice: miau");
    }
}
