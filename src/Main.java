import java.util.*;


public class Main {


    public static void main(String[] args) {

        System.out.println("Intersection: " + getIntersection(Set.of(1, 2, 3, 4), Set.of(5, 2, 7, 1)));
        System.out.println();
        System.out.println("Difference = " + getDifference(Set.of(1, 2, 3, 4), Set.of(5, 2, 7, 1)));
        System.out.println();
        System.out.println(countWords("Hello this is a string that contains Hello and other words"));
        System.out.println();

        List<Book> books = List.of(new Book("abc", "a", 123, Genre.HORROR),
                new Book("abc2", "a", 1777, Genre.HORROR),
                new Book("123", "b", 1230, Genre.COMEDY),
                new Book("321", "b", 1243, Genre.COMEDY),
                new Book("title", "c", 1923, Genre.HORROR),
                new Book("title 2", "d", 2023, Genre.HORROR));

        HashMap<String, List<Book>> getBooks = getBooks(books);
        for (HashMap.Entry<String, List<Book>> k : getBooks.entrySet()) {
            System.out.println(k);

        }
    }


    public static Set<Integer> getIntersection(Set<Integer> x, Set<Integer> y) {
        Set<Integer> union = new HashSet<>();
        for (int element : x) {
            if (y.contains(element)) {
                union.add(element);
            }

        }
        return union;
    }

    public static Set<Integer> getDifference(Set<Integer> x, Set<Integer> y) {
        Set<Integer> difference = new HashSet<>();
        for (int element : x) {
            if (!y.contains(element)) {
                difference.add(element);
            }

        }
        return difference;
    }


    public static HashMap<String, Integer> countWords(String str) {
        HashMap<String, Integer> wordToCount = new HashMap<>();
        String [] string = str.split("\\s+");
        for (String word : string) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 1);
            } else{
                wordToCount.put(word, wordToCount.get(word) + 1);
            }
        }
        return wordToCount;
    }


    public static HashMap<String, List<Book>> getBooks(List<Book> books) {
        HashMap<String, List<Book>> result = new HashMap<>();
        for (Book book : books) {
            String author = book.getAuthorName();
            if (!result.containsKey(author)) {
                List<Book> bookName = new ArrayList<>();
                bookName.add(book);
                result.put(author, bookName);
            } else {
                result.get(author).add(book);

            }
        }
        return result;
    }
}



