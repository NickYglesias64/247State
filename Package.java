public class Package {

    private StateInterface orderedState;
    private StateInterface inTransitState;
    private StateInterface deliveredState;
    private String name;
    private StateInterface state;

    /**
     * Constructor sets the states
     * @param contents
     */
    public Package(String contents) {
        orderedState = new OrderedState(this);
        inTransitState = new InTransitState(this);
        deliveredState = new DeliveredState(this);
        this.name = contents;

    }

    /**
     * changes the state to ordered
     */
    public void order() {
        setState(orderedState);
        state.displayStatus();
        state.displayETA();
    }

    /**
     * Changes the state to in transit
     */
    public void mail() {
        setState(inTransitState);
        state.displayStatus();
        state.displayETA();
    }

    /**
     * changes the state to delivered
     */
    public void received() {
        setState(deliveredState);
        state.displayStatus();
    }

    public void setState(StateInterface state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }
}
