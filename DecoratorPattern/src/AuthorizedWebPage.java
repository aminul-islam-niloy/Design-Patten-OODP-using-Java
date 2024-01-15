// AuthorizedWebPage class extending WebPageDecorator (Concrete Decorator)

class AuthorizedWebPage extends WebPageDecorator
 {
    private String user;

    public AuthorizedWebPage(WebPage decoratedPage, String user) {
        super(decoratedPage);
        this.user = user;
    }

    // to invoke the constructor of the base class (WebPageDecorator).
    //  The super keyword in Java is used to
    //  refer to the immediate parent class's members or invoke its constructor.

    @Override
    public void display() {
        checkAuthorization();
        super.display();
    }

    private void checkAuthorization() {
        System.out.println("Checking authorization for user: " + user);
        // Logic to check if the user is authorized goes here
        // For simplicity, let's assume all users are authorized in this example
    }
}
