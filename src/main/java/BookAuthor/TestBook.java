package BookAuthor;
public class TestBook {
    public static void main(String[] args) {

        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

// Test Getters and Setters
        javaDummy.setPrice(29.95);
        javaDummy.setQty(28);
        System.out.println("name is: " + javaDummy.getName());
        System.out.println("price is: " + javaDummy.getPrice());
        System.out.println("qty is: " + javaDummy.getQty());
//        System.out.println("Author is: " + javaDummy.getAuthor());  // Author's toString()
//        System.out.println("Author's name is: " + javaDummy.getAuthor().getName());
//        System.out.println("Author's email is: " + javaDummy.getAuthor().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
//        Book anotherBook = new Book("more Java",
//                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
//        System.out.println(anotherBook);  // toString()
//        System.out.println(dummyBook.getAuthorName());
//        System.out.println(dummyBook.getAuthorEmail());
//        System.out.println(dummyBook.getAuthorGender());

    }
}
