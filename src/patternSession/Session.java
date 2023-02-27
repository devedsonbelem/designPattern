package patternSession;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Session {
	private static DateTimeFormatter DTF =  DateTimeFormatter.ofPattern("yyyy-MM-DD hh:mm:ss");
 
	private String clientName;
    private LocalDateTime dataHora;
    
	public Session() {

	}

	public Session(String clientName) {
		super();
		this.clientName = clientName;
	}

 
 
	@Override
	public String toString() {
		return  clientName   +  "," + "Time = " +  DTF.format(getDataHora());
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	
	
	
 
}
