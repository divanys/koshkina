package pz_16_1;

class Magazine implements Printable {
    private String title;
    private String author;
    private int count;

    public Magazine(String title, String author, int count) {
        this.title = title;
        this.author = author;
        this.count = count;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getCount() {
        return count;
    }
}
