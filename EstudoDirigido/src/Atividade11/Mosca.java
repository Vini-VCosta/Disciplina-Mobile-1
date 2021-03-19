package Atividade11;

/**
 *
 * @author Vinicius Costa
 */
public class Mosca {
    private int qtdPatas;
    private String nome;
    private int idade;

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int calcularIdade(){
        return (idade / 5);
    }

    @Override
    public String toString() {
        return "\nEspecie: mosca" + "\nNome: " + nome + "\nCor do pelo: " + qtdPatas + "\nIdade: " + idade;
    }
}
