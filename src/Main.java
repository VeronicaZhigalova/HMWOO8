import java.util.*;


public class Main {


    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> y = new HashSet<>(Arrays.asList(5, 2, 7, 1));
        Set<Integer> union = new HashSet<>();
        for (Integer element : x) {
            union.add(element);
        }
        for (Integer element : y) {
            union.add(element);
        }
        Set<Integer> intersection = new HashSet<>();
        for (Integer element : x) {
            if (y.contains(element)) {
                intersection.add(element);
            }
        }
        System.out.println("Intersection: " + intersection);
        System.out.println("                              ");


        x.removeAll(y);
        System.out.println("Difference = " + x);
        System.out.println("                              ");


        String string = "Hello this is a string that contains Hello and other words";
        String[] words = string.split("\\s+");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }
        System.out.println("                              ");
    }

}

