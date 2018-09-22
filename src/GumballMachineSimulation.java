public class GumballMachineSimulation {
    public static void main(String[] args) {
        System.out.println("Initializing machine with 2 gumballs");
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println("\nGetting one gumball");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("\nChanging mind after inserting quarter");
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();

        System.out.println("\nTurning crank and dispensing gumball without inserting quarter");
        gumballMachine.turnCrank();
        gumballMachine.dispense();


        System.out.println("\nInserting a quarter twice");
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();

        System.out.println("\nGetting another gumball");
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        System.out.println("\nTrying to get gumball from sold out machine");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();
    }
}
