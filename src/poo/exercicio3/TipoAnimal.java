package poo.exercicio3;

public enum TipoAnimal {
    CACHORRO("cachorro"),GATO("gato");
    private final String nome;

    private TipoAnimal(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
}
