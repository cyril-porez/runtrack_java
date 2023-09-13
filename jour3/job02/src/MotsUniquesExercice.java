import java.util.*;

public class MotsUniquesExercice {

    public  MotsUniquesExercice() {

    }
    public static void main(String[] args) {
        List<String> wordArray = new ArrayList<String>(Arrays.asList(args));
        System.out.println(wordArray);

        List <String> arrayList = new ArrayList<String>();
        Set<String> uniqueWords = new HashSet<>();
        for (String word: wordArray) {
            if (!uniqueWords.add(word)) {
                arrayList.add(word);
            }
            uniqueWords.add(word);
        }

        System.out.println(arrayList);
    }
}
