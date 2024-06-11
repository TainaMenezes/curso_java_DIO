package src.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    List<Pessoa> listaPessoa = new ArrayList<>();

    public OrdenacaoPessoa() 
    {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) 
    {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() 
    {
        List<Pessoa> listaPessoaOrdenadaIdade = new ArrayList<>(listaPessoa);
        Collections.sort(listaPessoaOrdenadaIdade);

        return listaPessoaOrdenadaIdade;
    }

    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> listaPessoaOrdenadaAltura = new ArrayList<>(listaPessoa);
        Collections.sort(listaPessoaOrdenadaAltura, new ComparatorPorAltura());

        return listaPessoaOrdenadaAltura;
    }

}
