import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExercice {

    public static List<String> UppercaseName(List<String> listNames) {
        System.out.println(listNames);
        return listNames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args){
        List<String> name = new ArrayList<>(List.of(args));
        List<String> result = UppercaseName(name);
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < result.size(); i++) {
            str.append(result.get(i));
            if(i < result.size() - 1) {
                str.append(", ");
            }
        }

        System.out.println(str);
    }
}