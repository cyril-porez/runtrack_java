import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamCollectExercice {

    public static List<Integer> filterNumberLessThanReference(int reference, List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number < reference)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int reference = Integer.parseInt(args[0]);
        List<Integer> listNbr = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            listNbr.add(Integer.parseInt(args[i]));
        }

        List<Integer> result = filterNumberLessThanReference(reference, listNbr);

        StringBuilder str = new StringBuilder();
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            str.append(result.get(i));

            if(i < result.size() - 1) {
                str.append(", ");
            }

        }

        System.out.println("Nobres inférieur à " + reference + ": " + str);

    }
}
