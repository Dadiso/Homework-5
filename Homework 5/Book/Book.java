/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{ 
    String title; 
    String author; 
    String publisher; 
    int copiesSold;
    
    public Book(String title, String author, String publisher, int copiesSold){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public int getCopiesSold(){
        return copiesSold;
    }
    
    public void setTitle(String title){
        title = title;
    }
    
    public void setPublisher(String publisher){
        publisher = publisher;
    }
    
    public void setAuthor(String author){
        author = author;
    }
    
    public void setCopiesSold(int copiesSold){
        copiesSold = copiesSold;
    }
}
