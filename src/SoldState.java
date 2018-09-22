public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void dispense() {
        System.out.println("Dispensing a gumball for you!");
        gumballMachine.releaseGumball();
        if (gumballMachine.getCountOfGumballs() == 0) {
            System.out.println("Gumball machine now sold out");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        }
    }

    public void insertQuarter() {
        System.out.println("A quarter is already inserted before hand");
    }

    public void ejectQuarter() {
        System.out.println("Cannot eject quarter after turning crank");
    }

    public void turnCrank() {
        System.out.println("Cannot turn crank without dispensing gumball");
    }
}
