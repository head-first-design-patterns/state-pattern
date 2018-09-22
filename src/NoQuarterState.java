public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Turn the crank to dispense a gumball");
    }

    public void insertQuarter() {
        System.out.println("You've inserted a quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You'must insert quarter to eject one");
    }

    public void turnCrank() {
        System.out.println("You must insert a quarter to be able turn the crank");
    }
}
