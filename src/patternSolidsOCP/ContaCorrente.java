package patternSolidsOCP;

public class ContaCorrente extends Conta {
	private  double saldo;
	
    public ContaCorrente(double saldo) {
        super(saldo);
        this.saldo= saldo;
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
        setSaldo(getSaldo() + valor);
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

	public double getSaldo() {
		return saldo;
	}
    
}
