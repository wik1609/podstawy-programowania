public class zad3 {

    public static void main(String[] args) {
        int[] TablicaLC = {10, 20, 30, 40, 50};
        double suma = 0;
        for (int liczba : TablicaLC){
        suma += liczba;
        }
    double srednia = suma / TablicaLC.length;
    System.out.println("Średnia liczb = " + srednia);
    int[] LiczbaDoSprawdzenia = {30};
    for (int liczba : LiczbaDoSprawdzenia)
    if (liczba %2 ==0){
        System.out.println(liczba + " jest liczbą parzystą");
    }
    else {
        System.out.println(liczba + " jest liczbą nieparzystą");
    }
    }

}
