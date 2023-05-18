package bean;

import javax.annotation.ManagedBean;

import entidades.Agressor;
import entidades.Vitima;

@ManagedBean
public class IncidenteBean {
	private Vitima vitima;
	private Agressor agressor;

	public Vitima getVitima() {
		return vitima;
	}
	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}
	public Agressor getAgressor() {
		return agressor;
	}
	public void setAgressor(Agressor agressor) {
		this.agressor = agressor;
	}
	
}
