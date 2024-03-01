package poo.exercicio3;

public class Gato extends Animal{
    public Gato(TipoAnimal tipo,String nome,int idade){
        super(tipo,nome,idade);
    }
    public void emitirSom(){
        System.out.println("Miau Miau");
    }

}
