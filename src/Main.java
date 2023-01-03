import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int entero = 1;
        String string = "string1";

        modificaInt(entero);
        System.out.println(entero);

        modificaString(string);
        System.out.println(string);

        Clase objeto = new Clase(1, "string1");
        objeto.modificaObjeto(-99, "string modificado");
        System.out.println(objeto);

    }

    private static void modificaString(String a) {
        a = "string2";
    }

    private static void modificaInt(int a) {
        a = -99;
    }
}