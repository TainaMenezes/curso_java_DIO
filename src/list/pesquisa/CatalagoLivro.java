package src.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {

    private List<Livro> listaLivro = new ArrayList<>();

    public void adicionarLivro(Livro livro)
    {
        listaLivro.add(livro);
    }
    
    public List<Livro> pesquisarPorAutor(String autor)
    {
        List<Livro> livrosRetorno = new ArrayList<>();

        for (Livro livro : listaLivro) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosRetorno.add(new Livro(livro.getTitulo(), livro.getAutor(), livro.getAno()));
            }
        }
        return livrosRetorno;
    }

    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal) 
    {
        List<Livro> livrosRetorno = new ArrayList<>();

        for (Livro livro : listaLivro) {
            if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                livrosRetorno.add(livro);
            }
        }

        return livrosRetorno;
    }

    public Livro pesquisarPorTitulo(String titulo)
    {

        for (Livro livro : listaLivro) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }

        return new Livro();
    }

    @Override
    public String toString() {
        return "CatalagoLivro [listaLivro=" + listaLivro + "]";
    }

    public static void main(String[] args) {
        CatalagoLivro catalago = new CatalagoLivro();

        catalago.adicionarLivro(new Livro("Batman", "Tainá", 2014));
        catalago.adicionarLivro(new Livro("Titanic", "Felipe", 2010));
        catalago.adicionarLivro(new Livro("Barbie", "Cris", 2004));
        catalago.adicionarLivro(new Livro("Coca-cola", "Well", 2024));

        System.out.println(catalago.pesquisarPorAutor("Tainá").toString());
    }
    
}
