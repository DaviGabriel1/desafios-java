package poo.exercicio3;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro(TipoAnimal.CACHORRO,"Scooby",10);
        Gato g = new Gato(TipoAnimal.GATO,"Garfield",8);
        //Animal a = new Animal(); DARIA ERRO POIS È IMPOSSIVEL IMPLEMENTAR CLASSE ABSTRATA
        c.comer();
        g.comer();
        c.emitirSom();
        g.emitirSom();
    }
}
