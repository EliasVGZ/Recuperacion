import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


            System.out.println("\n--- Pasando arrays");

            int[] array1 = new int[5];
            printArray(array1);
            array1[0] = 0;  // innecesario ya que inicializa a 0 por defecto

            int[] array2 = array1;  // dos variables apuntando al mismo array
            int[] array3 = Arrays.copyOf(array1, array1.length); // dos arrays iguales

            IncrementaArray(array1);
            IncrementaArray(array2);
            IncrementaArray(array3);

            printArray(array1);
            printArray(array2);
            printArray(array3);
        }

        private static void IncrementaArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] + 1;
            }
        }


        private static void printArray(int[] array) {
            Arrays.stream(array).forEach(System.out::print);
            System.out.println();
        }


        private static void modificaVarInt(int a) {
            a++; // Incrementamos en 1
            System.out.println("Valor del int dentro del método:   " + a);
        }
        private static void modificaVarString(String a) {
            a += " modificado";
            System.out.println("Valor del string dentro del método: " + a);
        }
        private static void modificaVarObjeto(Clase o) {
            o = new Clase(o.entero + 1, "nuevo string"); // creamos un nueva instancia
            System.out.println("Valor del objeto dentro de método: " + o);
        }
        private static void modificaContenidoObjeto(Clase o) {
            o.entero = -99; // modificamos el contenido de la referencia
            o.string = "string modificado";
            System.out.println("Valor del objeto dentro de método: " + o);
        }
    }