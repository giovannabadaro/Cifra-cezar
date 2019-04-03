
package cifradecezar;

public class NewClass {

    public static String encriptar(int chave, String texto) {
        StringBuilder textoCifrado = new StringBuilder(); // vai guardar o texto que sera encriptado

        int tamanhoTexto = texto.length();// tamanho do texto a ser encriptado

        for (int c = 0; c < tamanhoTexto; c++) {
            int letraCifradaASCII = ((int) texto.charAt(c)) + chave;
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }
            textoCifrado.append((char) letraCifradaASCII);
        }
        return textoCifrado.toString();
    }
}
