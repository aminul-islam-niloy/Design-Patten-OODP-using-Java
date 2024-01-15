// Main class to demonstrate the decorator pattern
public class Decorator {
    public static void main(String[] args) {
        // Creating a simple web page
        WebPage simpleWebPage = new SimpleWebPage("Welcome to the Simple Web Page!");

        // Decorating the simple web page with authorization
        WebPage authorizedWebPage = new AuthorizedWebPage(simpleWebPage, "John");

        // Decorating the authorized web page with pagination
        WebPage paginatedWebPage = new PaginatedWebPage(authorizedWebPage, 1);

        // Displaying the final decorated web page
        paginatedWebPage.display();
    }
}