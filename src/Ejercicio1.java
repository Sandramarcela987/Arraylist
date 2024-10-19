import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

   ArrayList<Integer> numeros
           = new ArrayList<>();
   for (int num = 1; num <=5; num++) {
       numeros.add(num);
   }

        System.out.println("Numeros for");
   for (int num = 0; num<numeros.size(); num++){
       System.out.println(numeros.get(num));
   }
        System.out.println("Numeros for each");
   for  (int num: numeros){
       System.out.println(num);
   }
        System.out.println("Numeros while");

   int index = numeros.size()- 1;
   while (index>=0){
       System.out.println(numeros.get(index));
       index--;
   }



    }
}