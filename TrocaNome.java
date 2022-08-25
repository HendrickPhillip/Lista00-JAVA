/*Construa uma classe que solicite uma frase escrita pelo usuário.
Peça ao usuário para escolher uma palavra da frase escrita e
substituí-la por outra palavra.(Utilize o método replace()).
*/

package br.edu.hendrick.trocanome;
public class TrocaNome {

    public static void main(String[] args) {
    Texto texto = new Texto();
    texto.frase = "Hello World!!";
		texto.novaFrase = texto.frase.replace("Hello","Olá");
    texto.chamada();

  }
}
