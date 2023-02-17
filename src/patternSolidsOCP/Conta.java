package patternSolidsOCP;

 
 public abstract class Conta {
	    private double saldo;

	    public Conta(double saldo) {
	        this.saldo = saldo;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public abstract void debito(double valor);

	    public abstract void credito(double valor);
	} 

	
	
 
