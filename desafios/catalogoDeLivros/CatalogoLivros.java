package desafios.catalogoDeLivros;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> livroList;

    // método construtor que instancia a class "ArrayList"
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.obterAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }

            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.obterAnoPublicacao() >= anoInicial && livro.obterAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }

            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.obterTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;

                    break;
                }
            }

            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}