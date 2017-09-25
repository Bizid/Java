
package book;

abstract class NBook {
    String title;
    String author;
    
    NBook(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    
    abstract void display();
}
