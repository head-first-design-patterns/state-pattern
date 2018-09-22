public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Turn the crank to dispense a gumball");
    }

    public void insertQuarter() {
        System.out.println("A quarter is already inserted before hand");
    }

    public void ejectQuarter() {
        System.out.println("You've ejected a quarter");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Turned the crank. Click on dispense to get your gumball");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }
}
