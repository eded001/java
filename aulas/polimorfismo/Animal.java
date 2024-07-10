package aulas.polimorfismo;

public class Animal implements Falar {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public void falar(String fala) {
        System.out.println(fala);
    }
}