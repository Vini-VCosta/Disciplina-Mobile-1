package Atividade02;

/**
 *
 * @author Vinicius Costa
 */
public class Produto {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularDesconto(double valor){
        if(valor == 200){
            return (valor - 100);
        }else{
            return (valor);
        }
    }
}
