package poo.exercicio2;

public class Pessoa {
    private final String nome;
    private String endereco;
    private final int idade;

    public Pessoa(String nome, String endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void apresentarPessoa(){
        System.out.println("nome: "+getNome()+"\nidade: "+getIdade()+"\nendereço: "+getEndereco());
    }
    public void alterarEndereco(String novoEndereco){
        this.endereco=novoEndereco;
        System.out.println("endereço atualizado para '"+endereco+"'");
    }
}
