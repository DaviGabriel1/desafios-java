package poo.exercicio3;

public abstract class Animal {
    private final TipoAnimal tipo;
    private final String nome;
    private int idade;

    public Animal(TipoAnimal tipo, String nome, int idade) {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }

    public String getTipo() {
        return tipo.getNome();
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();

    public void comer(){
        System.out.println(getTipo()+" do nome "+getNome()+" foi alimentado");
    }


}
