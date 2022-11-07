public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book(200, "Love story",
                "Jane");
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(11, "Awesome", 5));

        System.out.println(book);

    }

}