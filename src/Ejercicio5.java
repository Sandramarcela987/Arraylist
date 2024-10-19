import java.util.ArrayList;
import java.util.List;
public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        for (int num1 = 1; num1 <= 5; num1++) {
            numeros.add(num1);

        }


        Integer[] arrayNumero = numeros.toArray(new Integer[0]);
        for (int num1 =0; num1 < arrayNumero.length; num1++)  {
            System.out.println(numeros.get(num1));
        }

    }
}
