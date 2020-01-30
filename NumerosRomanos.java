//Programa Java que lee un n�mero y lo convierte a n�meros romanos
import java.util.Scanner;

public class NumerosRomanos{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N;
      do {
             System.out.print("Introduce un n�mero entre 1 y 30: ");
             N = sc.nextInt();
      } while (N < 1 || N > 30);
      System.out.println(N + " en numeros romanos es: " + convertirANumerosRomanos(N));
  }

  //m�todo para pasar a n�meros romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, decenas, unidades;
      String romano = "";
     //obtenemos cada cifra del n�mero

      decenas = numero / 10 % 10;
      unidades = numero % 10;

     //decenas
      if (decenas == 9) {
           romano = romano + "XC";
      } else if (decenas >= 5) {
                      romano = romano + "L";
                      for (i = 6; i <= decenas; i++) {
                            romano = romano + "X";
                      }
      } else if (decenas == 4) {
                      romano = romano + "XL";
      } else {
                    for (i = 1; i <= decenas; i++) {
                           romano = romano + "X";
                    }
      }

     //unidades
      if (unidades == 9) {
           romano = romano + "IX";
      } else if (unidades >= 5) {
                      romano = romano + "V";
                      for (i = 6; i <= unidades; i++) {
                             romano = romano + "I";
                      }
      } else if (unidades == 4) {
                      romano = romano + "IV";
      } else {
                  for (i = 1; i <= unidades; i++) {
                         romano = romano + "I";
                  }
      }
      return romano;
  }
}