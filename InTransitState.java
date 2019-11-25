public class InTransitState implements StateInterface{

    private Package pkg;

    public InTransitState(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayStatus() {
        System.out.println(pkg.getName()+"is out for delivery");
    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayETA() {
        System.out.println(pkg.getName()+" should arrive within 5 days");
    }
}
