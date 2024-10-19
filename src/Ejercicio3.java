import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Integer> valor = new ArrayList<>();
        for (int num = 1; num <= 10; num++) {
            valor.add(num);
        }
        List<Integer> pares = new ArrayList<>();
        for (int numero : valor) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
            System.out.println("Numeros" + valor);
            System.out.println("Pares" + pares);
        }

    }
}