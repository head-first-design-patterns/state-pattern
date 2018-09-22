public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("No gumballs to buy, no gumballs to dispense");
    }

    public void insertQuarter() {
        System.out.println("No gumballs to buy");
    }

    public void ejectQuarter() {
        System.out.println("No gumballs to buy, no quarters to eject");
    }

    public void turnCrank() {
        System.out.println("No gumballs to buy, no cranks to turn");
    }
}
