package patternSolidsOCP;

public class ContaPoupanca extends Conta {
	
	private double saldo;
	    public ContaPoupanca(double saldo) {
	        super(saldo);
	        this.saldo = saldo;
	    }

	    @Override
	    public void debito(double valor) {
	        if (valor > getSaldo()) {
	            throw new RuntimeException("Saldo insuficiente");
	        }
	        setSaldo(getSaldo() - valor);
	    }

	    @Override
	    public void credito(double valor) {
	        setSaldo(getSaldo() + valor * 1.05); // Juros de 5% ao mês
	    }

	    private void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

		public double getSaldo() {
			return saldo;
		}
	    
 }
 