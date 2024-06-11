package src.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> listaLivro = new ArrayList<>();

    public CatalogoLivro() {
        this.listaLivro = new ArrayList<Livro>();
    }

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
        return "CatalogoLivro [listaLivro=" + listaLivro + "]";
    }

    public static void main(String[] args) {
        CatalogoLivro catalogo = new CatalogoLivro();

        catalogo.adicionarLivro(new Livro("Batman", "Tainá", 2014));
        catalogo.adicionarLivro(new Livro("Titanic", "Felipe", 2010));
        catalogo.adicionarLivro(new Livro("Barbie", "Cris", 2004));
        catalogo.adicionarLivro(new Livro("bebida", "Well", 2024));
        catalogo.adicionarLivro(new Livro("Bebida", "Tainá", 2020));

        System.out.println(catalogo.pesquisarPorAutor("Tainá").toString());
        System.out.println(catalogo.pesquisarIntervaloAnos(2004, 2010).toString());
        System.out.println(catalogo.pesquisarPorTitulo("Bebida"));
    }
    
}
