import java.util.Arrays;
import java.util.HashSet;

public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<String>();
        for (String arg: args) {
            animals.add(arg);
        }

        for (String animal: animals) {
            System.out.println(animal);
        }
    }
}
