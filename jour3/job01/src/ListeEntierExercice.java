import java.util.*;

public class ListeEntierExercice {
    public ListeEntierExercice() {

    }

    public static void main(String[] args) {

        List<Integer> entireArray = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            entireArray.add(Integer.parseInt(args[i]));
        }

        int sum = 0;
        for (int i = 0; i < entireArray.size(); i++) {
            if (entireArray.get(i) % 2 ==  0) {
                sum += entireArray.get(i);
            }
        }
        System.out.println(sum);
    }
}
