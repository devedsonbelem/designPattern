package patternbridge;

public class Abstraction {

	protected Implementor implementor;
	
	

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	
	

	public void operation() {
		implementor.operation();
	}

}
