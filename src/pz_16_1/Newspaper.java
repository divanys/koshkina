package pz_16_1;

class Newspaper implements Printable {
    private String title;
    private String author;

    public Newspaper(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
