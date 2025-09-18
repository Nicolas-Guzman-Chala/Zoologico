package model;

public class Pato extends Animal {

    public Pato(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "dice: quack");
    }
}
