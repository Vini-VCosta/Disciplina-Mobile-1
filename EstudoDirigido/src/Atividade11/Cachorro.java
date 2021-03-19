package Atividade11;

/**
 *
 * @author Vinicius Costa
 */
public class Cachorro {
    private String corPelo;
    private String nome;
    private int idade;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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
        return (idade * 30);
    }

    @Override
    public String toString() {
        return "\nEspecie: cachorro" + "\nNome: " + nome + "\nCor do pelo: " + corPelo + "\nIdade: " + idade;
    }
    
}
