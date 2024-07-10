import java.util.List;
import java.util.ArrayList;

public class PessoasList {
    private List<Pessoa> pessoasList;
    private Pessoa pessoa;

    public PessoasList() {
        this.pessoasList = new ArrayList<>();
    }

    public void addPessoa(String nome, char sexo, int idade, double altura) {
        pessoa = new Pessoa(nome, sexo, idade, altura);
        pessoasList.add(pessoa);
    }

    public List<String> returnPessoasNome() {
        List<String> pessoasNomeList = new ArrayList<>();

        for(Pessoa pessoa : this.pessoasList) {
            pessoasNomeList.add(pessoa.getNome());
        }
        return pessoasNomeList;
    }

    public List<Pessoa> returnPessoas() {
        return this.pessoasList;
    }
}