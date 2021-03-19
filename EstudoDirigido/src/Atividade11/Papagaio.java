package Atividade11;

/**
 *
 * @author Vinicius Costa
 */
public class Papagaio {
    private String corPena;
    private String nome;
    private int idade;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
        return (idade * 20);
    }

    @Override
    public String toString() {
        return "\nEspecie: papagaio" + "\nNome: " + nome + "\nCor do pelo: " + corPena + "\nIdade: " + idade;
    }
}
