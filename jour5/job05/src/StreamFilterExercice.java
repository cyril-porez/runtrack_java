import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExercice {

    public static List<Integer> FilterNumberGreaterThanValue(int nbrReference, List<Integer> listNumbers) {
        return listNumbers.stream()
                .filter(number -> number > nbrReference)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        int nbrReference = Integer.parseInt(args[0]);

        List<Integer> listNumber = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            int nbr = Integer.parseInt(args[i]);
            listNumber.add(nbr);
        }

        List<Integer> result = FilterNumberGreaterThanValue(nbrReference, listNumber);

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < result.size(); i++) {
            str.append(result.get(i));
            if(i < result.size() - 1) {
                str.append(", ");
            }
        }
        System.out.println("Nombre spérieur à " + nbrReference + ": " + str);
    }
}
