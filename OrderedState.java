public class OrderedState implements StateInterface {

    private Package pkg;

    /**
     * sets the package to the object
     * @param pkg
     */
    public OrderedState(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayStatus() {
        System.out.println(pkg.getName()+" was ordered");

    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayETA() {
        System.out.println(pkg.getName()+" should arrive in 5 to 7 business days");
    }
}
