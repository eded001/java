// package desafios.jogoDaForca;

import java.util.Arrays;

public class JogoForca {
    private String palavra;
    private String linha;
    private String dica;
    private int pontuacao = 6;

    private class PedacosCorpo {
        public String cabeca = "O";
        public String bracoEsquerdo = "/";
        public String tronco = "|";
        public String bracoDireito = "\\";
        public String pernaEsquerda = "/";
        public String pernaDireita = "\\";
    }

    public JogoForca(String palavra, String dica) {
        this.palavra = palavra;
        this.dica = dica;
    }

    public void mostrarBonequinho() {
        PedacosCorpo pedacosCorpoBoneco = new PedacosCorpo();
        String cabeca = pedacosCorpoBoneco.cabeca;
        String bracoEsquerdo = pedacosCorpoBoneco.bracoEsquerdo;
        String tronco = pedacosCorpoBoneco.tronco;
        String bracoDireito = pedacosCorpoBoneco.bracoDireito;
        String pernaEsquerda = pedacosCorpoBoneco.pernaEsquerda;
        String pernaDireita = pedacosCorpoBoneco.pernaDireita;

        System.out.println("|_____");
        System.out.println("|    |");
        System.out.println("|    " + cabeca);
        System.out.println("|   " + bracoEsquerdo + tronco + bracoDireito);
        System.out.println("|   " + pernaEsquerda + pernaDireita);
        System.out.println("|");
    }

    public void mostrarLinha() {
        System.out.println(this.linha);
    }

    private String getLinha() {
        int palavraLength = this.palavra.length();
        String linha = "";

        for (int i = 1; i <= palavraLength; i++) {
            linha += "_";
        }

        this.linha = linha;

        return linha;
    }

    public String getDica() {
        return this.dica;
    }

    public void atualizarLinha(String[] letras) {
        String palavra = this.palavra;
        String linha = this.getLinha();
        String[] linhaArray = linha.split("");
        PedacosCorpo pedacosCorpoBoneco = new PedacosCorpo();
        letras.toString().length();

        for(String letra : letras) {
            if(palavra.contains(letra)) {
                int firstIndexLetra = palavra.indexOf(letra);
                int lastIndexLetra = palavra.lastIndexOf(letra);
                String linhaArrayConvertida = "";

                if(firstIndexLetra == lastIndexLetra) {
                    linhaArray[firstIndexLetra] = letra;

                    linhaArrayConvertida = Arrays.toString(linhaArray).replace("[", "").replace("]", "").replaceAll(",", "").replaceAll(" ", "");
                } else {
                    String[] palavraArray = palavra.split("");

                    for(int i = palavra.length() - 1; i >= 0; i--) {
                        if(palavraArray[i].equalsIgnoreCase(letra)) {
                            linhaArray[i] = letra;
                        }

                        linhaArrayConvertida = Arrays.toString(linhaArray).replace("[", "").replace("]", "").replaceAll(",", "").replaceAll(" ", "");
                    }
                }

                this.linha = linhaArrayConvertida;
            } else {
                // apagar pedaços do bonequinho
                pontuacao -= 1;

                Switch(pontuacao) {
                    case 5:
                        pedacosCorpo.pernaDireita = "X";
                        break;
                    default:
                        System.out.println("seila");
                }

                System.out.println(pontuacao);
            }
        }
    }
}