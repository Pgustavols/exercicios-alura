package variaveis;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        int celsius = 20;
        double fahrenheit = ((double) (celsius * 9) / 5) + 32;

        System.out.println(celsius+"ºC equivalem a "+String.format("%.2f", fahrenheit)+"ºF");
    }
}
