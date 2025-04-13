class Book{
    String title,author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.println("Book Details ---->");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
    }
}

public class BookWithTitleNauthor {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling");
        book.display();
    }
}
