public class Main {
    public static void main(String args[]) {
        PessoasList pessoasList = new PessoasList();
        pessoasList.addPessoa("Edgar", 'm', 19, 1.84);
        pessoasList.addPessoa("Cecília", 'f', 11, 1.57);

        // System.out.println(pessoasList.returnPessoas());
        System.out.println(pessoasList.returnPessoasNome());
    }
}