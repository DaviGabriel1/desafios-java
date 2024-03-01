package poo.exercicio3;

public class Cachorro extends Animal{

    public Cachorro(TipoAnimal tipo,String nome, int idade){
        super(tipo,nome,idade);
    }
    public void emitirSom(){
        System.out.println("AU AU");
    }
}
