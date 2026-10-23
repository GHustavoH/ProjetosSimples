package VerificadorGeral;


public class FuncoesBase {

    public String palavra;
    public int numero;

    public FuncoesBase() {
    }

    public void definirPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void definirNumero(int numero) {
        this.numero = numero;
    }

    public String inverterPalavra() {
        String palavraInvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            char letraAtual = palavra.charAt(i);
            palavraInvertida += letraAtual;
        }
        return palavraInvertida;
    }

    public String verificarPalindromo() {
        if(inverterPalavra().equalsIgnoreCase(palavra)){
            return "É um palindromo";
        }
        return "Nao é um palindromo";
    }

    public int contadorVogais() {
        String vogais = "aeiou";
        String novaPalavra = palavra.toLowerCase();
        int contador = 0;

        for (int i = 0; i < novaPalavra.length(); i++) {
            char letra = novaPalavra.charAt(i);
            for (int j = 0; j < vogais.length(); j++) {
                if (vogais.charAt(j) == letra) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public String verificadorParImpar() {
        if (numero % 2 == 0) {
            return "SEU NUMERO É PAR";
        }

        return "SEU NUMERO É IMPAR";
    }

    public int transformadorFatorial() {
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }

        return fatorial;
    }
}
