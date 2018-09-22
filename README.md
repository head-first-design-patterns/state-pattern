## State Pattern

State pattern provides a clean way for an object to alter its behavior on internal state changes.

Use case of state pattern: When a system can be in lots of different state, but must perform same set of behaviors. 

Behavior of system may differ per state, but the system must handle all behaviors no matter the state.

When requirements come in for new states and behaviors of a system, state pattern helps follow the OCP principle. 

### Key principles:

- State pattern is very similar to strategy pattern. The key difference is intent. 
  - In the case of strategy pattern, the client defines desired behavior. In case of state pattern, the object itself defines the behavior based on state.
  - In strategy pattern, client possesses flexibility, in state pattern, object possesses flexibility.
- All the state classes which encapsulate behaviors are co-dependent. That's the only disadvantage of state pattern.
- State classes can be abstract or an interface, depending on whether we need common behavior between states or not.
- State classes can be shared amongst multiple context classes. In that case, a state class cannot be composed of a context object. 
- NOTE: State transitions can happen inside state classes or the main object in context. The decision of where to perform state transitions can be a tricky one!
- Caution: Make sure that accide ntally one state class isn't handling more than ONE state. Then the whole point of using state pattern will be null and void. 

### Understanding the code

- This is a simulation of implementing a gumball machine
- The gumball machine has to handle behavior of inserting a quarter, ejecting a quarter, turning the crank and releasing the gumball
- Internally, the gumball machine can be in 4 states: having a quarter, having no quarter, sold and sold out state.
- This simulation attempts all the behaviors on a system in different state.
- See the extensibility for yourselves by adding a new behavior to the gumball machine like random lucky winners, refilling, etc.

### Running the code

```
cd src/
javac GumballMachineSimulation.java
java GumballMachineSimulation

```