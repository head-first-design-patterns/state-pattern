//Question: Should the context machine in question too should implement the state interface?
// In case state is an abstract class, then it shouldn't inherit it.
public class GumballMachine implements State {
    State soldOutState;
    State soldState;
    State hasQuarterState;
    State noQuarterState;

    State currentState;

    int countOfGumballs;

    public GumballMachine(int numberOfGumballs)  {
        countOfGumballs = numberOfGumballs;

        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);

        currentState = noQuarterState;
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void releaseGumball() {
        System.out.println("A gumball comes rolling out...");
        if (countOfGumballs != 0) {
            countOfGumballs = countOfGumballs - 1;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setCurrentState(State state) {
        currentState = state;
    }

    public int getCountOfGumballs() {
        return countOfGumballs;
    }
}
