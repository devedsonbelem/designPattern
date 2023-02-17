package patternSolidsOCP;

public class ContaCorrenteERR  extends ContaErr{
	private Double saldo=0.;
	
	 public ContaCorrenteERR(Double saldo) {
        super(saldo);
     }

    public void debito(Double valor) {
        if (valor > getSaldo()) {
            throw new RuntimeException("Saldo insuficiente");
        }
        setSaldo(getSaldo() - valor);
    }

    public void credito(Double valor) {
        setSaldo(getSaldo() + valor);
    }

    private void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
