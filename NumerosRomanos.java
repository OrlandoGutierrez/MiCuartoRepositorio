//Programa Java que lee un número y lo convierte a números romanos
import java.util.Scanner;

public class NumerosRomanos{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N;
      do {
             System.out.print("Introduce un número entre 1 y 30: ");
             N = sc.nextInt();
      } while (N < 1 || N > 30);
      System.out.println(N + " en numeros romanos es: " + convertirANumerosRomanos(N));
  }

  //método para pasar a números romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, decenas, unidades;
      String romano = "";
     //obtenemos cada cifra del número

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