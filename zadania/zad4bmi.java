public class zad4bmi {

    public static void main(String[] args) {
        double masa = 82; //masa ciala w kilogramach
        double wzrost = 1.8; //wzrost w metrach
        double BMI = masa / (wzrost * wzrost); //wzrost do kwadratu poniewaz tak jest we wzorze
        System.out.println("BMI jest równe " + BMI);
    }

}
