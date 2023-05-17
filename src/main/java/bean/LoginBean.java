package bean;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	public String logar() {
		return "cadastro_incidente.xhtml?faces-redirect=true";
	}
}
