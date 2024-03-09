public class zad2tablica {

    public static void main(String[] args) {
        int[] TablicaLC = {10, 20, 30, 40, 50};
        double suma = 0;
        for (int liczba : TablicaLC){
        suma += liczba;
        }
        double srednia = suma / TablicaLC.length;
        System.out.println("Średnia liczb = " + srednia);
        }
    }
