public class Pessoa {
    private String nome; // obs.: usar aspas duplas ("") quando for armazenar uma variável do tipo String
    private char sexo; // obs.: usar aspas simples ('') quando for armazenar uma variável do tipo char
    private int idade;
    private double altura;

    public Pessoa(String nome, char sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }
    public char getSexo() {
        return this.sexo;
    }
    public int getIdade() {
        return this.idade;
    }
    public double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "{" + nome +
        ", " + sexo +
        ", " + idade +
        ", " + altura + "}";
    }
}