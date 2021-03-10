package Atividades;
/**
 *
 * @author Vinicius Costa
 */
public class Livro {
    private String titulo,autor,genero;
    private int ano;
    private double preco;

    public Livro() {
    }

    public Livro(String titulo, String autor, String genero,int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String verificarDescontoLivro(){
        if(ano >= 60 && preco >= 500){
            return "O livro ganha desconto de 50%";
        }else if(ano >= 5){
            return "O livro ganha desconto de 20%";
        }else{
            return "Sem deconto para esse livro";
        }
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nGenero: " + genero + "\nAno: " + ano + "\nPreco: " + preco;
    }
    
    
    }
    
