import java.util.*;


public class Book {

    private String bookName;
    private String authorName;
    private int yearOfIssue;
    private Genre genre;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName != null && !bookName.isEmpty()) {
            this.bookName = bookName;
        } else {
            throw new IllegalArgumentException("Should be book name");
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if (authorName != null && !authorName.isEmpty()) {
            this.authorName = authorName;
        } else {
            throw new IllegalArgumentException("Should be author name");
        }
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 0) {
            this.yearOfIssue = yearOfIssue;
        } else {
            throw new IllegalArgumentException("Years can't be negative");
        }
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Book(String bookName, String authorName, int yearofIssue, Genre genre) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfIssue = yearofIssue;
        this.genre = genre;
    }

    public String getInfo() {
        return bookName + " " + authorName + " " + yearOfIssue + " " + genre.toString();
    }


    public static void main(String[] args) {
        Book book = new Book("The Captain's Daughter,", "Alexander Pushkin,", 1836, Genre.NOVEL);

        System.out.println(book.getInfo());

        System.out.println("                                  ");

        HashMap<String, String> books = new HashMap<String, String>();
        books.put("abc", "a , " + " release year:" + 123 + ", genre:" + Genre.HORROR);
        books.put("abc2 ", "a , " + " release year:" + 1777 + ", genre:" + Genre.HORROR);
        books.put("123 ", "b, " + " release year:" + 1230 + ", genre:" + Genre.COMEDY);
        books.put("321 ", "b, " + " release year:" + 1243 + ", genre:" + Genre.COMEDY);
        books.put("title ", "c, " + " release year:" + 1923 + ", genre:" + Genre.HORROR);
        books.put("title 2 ", "d, " + " release year:" + 2023 + ", genre:" + Genre.HORROR);


        System.out.println(books);

    }
}