// PaginatedWebPage class extending WebPageDecorator (Concrete Decorator)
class PaginatedWebPage extends WebPageDecorator 
{
    private int pageNumber;

    public PaginatedWebPage(WebPage decoratedPage, int pageNumber) {
        super(decoratedPage);
        this.pageNumber = pageNumber;
    }

    @Override
    public void display() {
        super.display();
        displayPagination();
    }

    private void displayPagination() {
        System.out.println("Displaying page number: " + pageNumber);
    }
}