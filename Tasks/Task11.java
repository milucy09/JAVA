package Tasks;

class Book {
     String title;
     String author;
     int yearPublished;
     double price;

    Book(String Title, String Author,int yearPublished, double price){
        this.title = Title;
        this.author = Author;
        this.yearPublished = yearPublished;
        this.price = price; 
    }
    
    public String toString() {
        return "Title: \"" + title + "\"\n" +
                "Author: \"" + author + "\"\n" +
                "yearPublished: \"" + yearPublished + "\"\n" +
                "Price: $" + price + "\n";
    }
}

public class Task11 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book b2 = new Book("Phython Basics", "Jane Doe", 2020, 29.99);
        Book b3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\n" + b1);
        System.out.println("Book 2:\n" + b2);
        System.out.println("Book 3:\n" + b3);
    }

}
