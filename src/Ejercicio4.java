import java.util.ArrayList;
import java.util.List;
public class Ejercicio4 {
    public static void main(String[] args) {

        String fruta1 = "Apple";
        String fruta2 = "Banana";
        String fruta3 = "Cherry";
        String date4 = "Date";
        String fruta5 = "Elderberry";
        String fruta6 = "Fig";

        List <String> list1 = new ArrayList<>();
        list1.add(fruta1);
        list1.add(fruta2);
        list1.add(fruta3);
        list1.add(date4);

        List <String> list2 = new ArrayList<>();
        list2.add(fruta2);
        list2.add(date4);
        list2.add(fruta3);
        list2.add(fruta5);

        List<String> commonElements= new ArrayList<>();
        for (String comun : list1){
            if (list2.contains(comun)){
                commonElements.add(comun);
            }

        }

        System.out.println("Elementos Comunes:" + commonElements);


    }
}


