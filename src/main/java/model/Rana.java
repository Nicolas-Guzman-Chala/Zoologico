package model;

public class Rana extends Animal{

    public Rana(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "dice: rabbit");
    }
}
