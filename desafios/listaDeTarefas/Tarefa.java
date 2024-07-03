package desafios.listaDeTarefas;

public class Tarefa {
    // atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String obterDescricao() {
        return descricao;
    }
}