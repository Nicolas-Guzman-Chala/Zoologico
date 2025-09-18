package model;

public class Raton extends Animal{
    public Raton(String nombre){
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + "dice: quizzz");
    }
}
