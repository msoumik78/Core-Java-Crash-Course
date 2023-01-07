public class FirstMethod {
    public static void main(String[] args) {
        System.out.println("30 F is : "+findTempInCelcius(30) +" C");
        System.out.println("40 F is : "+findTempInCelcius(40) +" C");
        System.out.println("50 F is : "+findTempInCelcius(50) +" C");
    }

    private static float findTempInCelcius(float tempInFahrenheit) {
        float tempInCelcius = (tempInFahrenheit - 32) * 0.5556f;
        return tempInCelcius;
    }
}
