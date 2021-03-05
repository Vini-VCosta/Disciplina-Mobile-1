package Atividades;

/**
 *
 * @author Vinicius Costa
 */
public class cliente {
    private String nome;
    private int idade;
    private Double renda;

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

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    
    public String classificarIdade(){
        String resposta;
        
        if(idade < 18){
            resposta = "Não! Pois você é menor de idade";
        }else{
            resposta = "Sim! Pois você é maior de idade";
        }
    
    return resposta;
    }
    
    public String classificarRenda(){
        String resposta;
        
        if(renda <= 15000){
            resposta = "Não! Pois você é pobre";
        }else{
            resposta = "Sim! Pois você é rico";
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +"\nIdade: " + idade + "\nRenda: " + renda;
    }
    
    
}
