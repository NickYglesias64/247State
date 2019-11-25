public class DeliveredState implements StateInterface {

    private Package pkg;

    public DeliveredState(Package pkg) {
        this.pkg = pkg;
    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayStatus() {
        System.out.println(pkg.getName()+" is here for you");
    }

    /**
     * Overrides the interface method
     */
    @Override
    public void displayETA() {
        System.out.println(pkg.getName()+" is here");
    }
}
