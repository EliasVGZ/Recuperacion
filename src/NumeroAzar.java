import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class NumeroAzar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Random r = new Random();
        int azar = r.nextInt(100)+1;
        System.out.println(azar);
        int num=0;
        int oportunidades=5;

        do{
            System.out.println("ADIVINA NUMERO ENTRE 0 Y 100, TIENES 5 OPORTUNIDADES");
            num = Integer.parseInt(br.readLine());
            oportunidades--;
            if (num==azar) {
                System.out.println("LO HAZ ACERTADO, ERES UN GENIO");
            }
            else if(num>azar){
                System.out.println("El numero es mayor");
                System.out.println("Te quedan " + oportunidades+ " oportunidades");
            }else{
                System.out.println("El numero es menor");
                System.out.println("Te quedan " + oportunidades+ " oportunidades");
            }
            if(oportunidades==0){
                System.out.println("No te quedan oportunidades, el numero era "+azar);
            }

        }while(azar!=num && oportunidades>0);
    }
}