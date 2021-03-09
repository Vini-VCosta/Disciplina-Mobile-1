package Atividades;

/**
 *
 * @author Vinicius Costa
 */
public class Livro {
    
    private String titulo, autor,genero;
    private int ano;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setGenero (String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }        
    
    public String verificarDesconto(){
        
        if (this.preco >= 80){
            return "Legal, você ganhou 20% de desconto!";
        }else{
            return "Que pena, você não ganhou os 20% de desconto";
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +"Autor: " + autor +"Genero: " + genero + "Ano: " + ano + "Preço: " + preco;
    }
    
       
}
