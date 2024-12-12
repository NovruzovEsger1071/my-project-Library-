public class Book {
    private int id;
    private String title;
    private String author;
    private Boolean status;

    public Book(int id, String title, String author, Boolean status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
