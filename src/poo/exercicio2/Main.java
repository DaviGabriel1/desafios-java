package poo.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Davi Gabriel","rua omega,tangamandapio",19);
        p.apresentarPessoa();
        p.alterarEndereco("rua dos alvinistas, konoha");
        p.apresentarPessoa();
    }
}
