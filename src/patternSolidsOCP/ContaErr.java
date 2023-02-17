package patternSolidsOCP;

public class ContaErr {
         private Integer idConta;
         private String nomeCorrentista;
         
	    private double saldo;

	    public ContaErr(double saldo) {
	        this.saldo = saldo;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

		public Integer getIdConta() {
			return idConta;
		}

		public void setIdConta(Integer idConta) {
			this.idConta = idConta;
		}

		public String getNomeCorrentista() {
			return nomeCorrentista;
		}

		public void setNomeCorrentista(String nomeCorrentista) {
			this.nomeCorrentista = nomeCorrentista;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
 
	    
	    

}
