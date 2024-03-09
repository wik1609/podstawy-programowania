public class master{
   public class Main {
      public static void main(String[] args) {
          int[] tablicaOcen = {4, 5, 3, 2, 4}; // Przykładowa tablica ocen
  
          // Określanie stopnia zaliczenia dla każdej oceny w tablicy
          String[] stopnie = okreslStopienZaliczenia(tablicaOcen);
  
          // Wyświetlanie wyniku
          for (int i = 0; i < tablicaOcen.length; i++) {
              System.out.println("Ocena " + tablicaOcen[i] + " = " + stopnie[i]);
          }
      }
  
      // Metoda określająca stopień zaliczenia na podstawie oceny
      public static String[] okreslStopienZaliczenia(int[] oceny) {
          String[] stopnie = new String[oceny.length];
          for (int i = 0; i < oceny.length; i++) {
              stopnie[i] = okreslStopien(oceny[i]);
          }
          return stopnie;
      }
  
      // Metoda określająca stopień zaliczenia na podstawie pojedynczej oceny
      public static String okreslStopien(int ocena) {
          switch (ocena) {
              case 5:
                  return "A";
              case 4:
                  return "B";
              case 3:
                  return "C";
              case 2:
                  return "D";
              case 1:
                  return "F";
              default:
                  return "Nieznany stopień";
          }
      }
  