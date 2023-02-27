package patternbridge;

public class MainImplementor {

	public static void main(String[] args) {
		
		  Abstraction ab = new RefinedAbstraction();
		  
          ab.implementor = new ConcreteImplementorA();
          ab.operation();
          
          
          ab.implementor = new ConcreteImplementorB();
          ab.operation();

	}
}
