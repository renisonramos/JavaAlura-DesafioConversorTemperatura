public class Main {
    public static void main(String[] args) {
        System.out.println("Conversor de Temperaturas");
        double celcius = 36;
        double fahrenheit = (celcius * 1.8) + 32;

        System.out.println("""
                A temperatura escolhida foi %d Graus Celsius
                Convertento em Fahrenheit fica:
                %.2f Fahrenheit.
                """.formatted(celcius, fahrenheit));



    }
}