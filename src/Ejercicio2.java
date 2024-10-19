
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {


        public static void main (String[] args) {

            String fruta1 = "Apple";
            String fruta2 = "Banana";
            String fruta3 = "Cherry";

            List<String> fruits = new ArrayList<>();
            fruits.add(fruta1);
            fruits.add(fruta2);
            fruits.add(fruta3);

            System.out.println(fruits);
            System.out.println(fruits.size());

            fruits.remove(1);
            System.out.println(fruits);

            fruits.set(1,"Orange");
            System.out.println(fruits);


        }

    }

