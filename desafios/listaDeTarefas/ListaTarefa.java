package desafios.listaDeTarefas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    // atributo privado com o tipo genérico "Tarefa"
    private List<Tarefa> tarefaList;

    // método construtor que cria um array
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // método que adiciona uma nova tarefa adicionando ao ArrayList com o método "add" instanciando a classe "Tarefa"
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    /*
    método que remove uma tarefa criando um novo ArrayList, executando um laço for each
    verificando se a descrição inserida é mesma da descrição da tarefa que deseja-se apagar
    e adicionada para o array para remover todas as ocorrências das tarefas com tal descrição
    */
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa tarefa : tarefaList)
        {
            if(tarefa.obterDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    // método que retorna o comprimento do array com as tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // método que retorna as descrições das tarefas
    public String obterDescricoesTarefas(int index) {
        if (index >= 0 && index < this.tarefaList.size()){
            return this.tarefaList.get(index).obterDescricao();
        }

        return null;
    }
}