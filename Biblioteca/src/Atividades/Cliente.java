package Atividades;

/**
 *
 * @author vinid
 */
public class Cliente {
    private String nome;
    private int idade;
    private Double renda;

    public Cliente() {
    }

    public Cliente(String nome, int idade, Double renda) {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
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
            resposta = "Não! Pois você aparenta não ter dinheiro";
        }else{
            resposta = "Sim! Pois você aparenta ter dinheiro";
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +"\nIdade: " + idade + "\nRenda: " + renda;
    }  
    }
    
