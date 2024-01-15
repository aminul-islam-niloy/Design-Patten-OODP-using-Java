// SimpleWebPage class implementing the WebPage interface (Concrete Component)
class SimpleWebPage implements WebPage {
    private String content;

    public SimpleWebPage(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Displaying simple web page with content: " + content);
    }
}