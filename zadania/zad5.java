public class zad5 {
    public static void main(String[] args) {
        int[] TablicaOcen = {1, 2, 3, 4, 5, 6};
        double suma = 0;
        for (int ocena : TablicaOcen){
        suma += ocena;
        }
        double srednia = suma / TablicaOcen.length;
    String stopien = ""; //okreslanie stopnia zaliczenia
    if (srednia >= 5.5){
        stopien = "A";
    } else if (srednia >= 4.5){
        stopien = "B";
    } else if (srednia >= 3.5){
        stopien = "C";
    } else if (srednia >= 2.5){
        stopien = "D";
    } else {
        stopien = "F";
    }
    System.out.println("Średnia ocen: " + srednia);
    System.out.println("Stopień zaliczenia: " + stopien);
    
    }

}
