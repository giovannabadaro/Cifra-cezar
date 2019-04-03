/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradecezar;

public class Descriptando {
    
  public static String decriptar (int chave, String textoCifrado){
      
      StringBuilder texto = new StringBuilder();
      int tam = textoCifrado.length();
      
      for (int c=0 ;c<tam; c++){
          int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
          
          while(letraDecifradaASCII < 32)
            letraDecifradaASCII += 94;
          
          texto.append( (char)letraDecifradaASCII );

      }
      return texto.toString();
  } 
}
