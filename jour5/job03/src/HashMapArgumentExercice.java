import java.util.HashMap;

public class HashMapArgumentExercice {

    public static void main(String[] args) {

        HashMap<String, String> person = new HashMap<String, String>();

        for (int i = 0; i < args.length; i = i + 2) {
            String key = args[i];
            String value = args[i + 1];
            person.put(key, value);
        }
        System.out.println(person);

        for (String element : person.keySet()) {
            System.out.println(element + ": " + person.get(element));
        }

    }
}
