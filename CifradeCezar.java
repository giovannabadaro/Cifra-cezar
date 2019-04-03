package cifradecezar;

import static cifradecezar.Descriptando.decriptar;
import static cifradecezar.NewClass.encriptar;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CifradeCezar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            Scanner entrada = new Scanner(System.in);
            FileWriter texto = new FileWriter(texto.txt);
            PrintWriter pr = new PrintWriter (texto);
            
            System.out.println("*****************************************************");

            // Informa texto e chave de criptografia
            System.out.print("Informe o texto a ser criptografado: ");
            String texto = entrada.nextLine();
            
            System.out.print("Informe a chave de deslocamento: ");
            int chave = entrada.nextInt();

            // Criptografando
            String textoCriptografado = encriptar(chave, texto);
            System.out.println("\n\nTEXTO CRIPTOGRAFADO: " + textoCriptografado);
            
            //Descriptografando
            String textoDescriptografado = decriptar (chave, texto);
            System.out.println ("\n TEXTO DECRIPTOGRAFADO: " + textoDescriptografado);
         
        } catch (RuntimeException e) {
            System.out.println("A chave de deslocamento foi informada incorretamente.");
            System.out.println("Execute o programa novamente e entre com uma chave valida.");
        }

    }
}
