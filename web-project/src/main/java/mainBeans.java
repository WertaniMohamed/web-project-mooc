import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class mainBeans {
	private String login;
	private String password;
	private String nameUser = "Espprit";
	private String profile;
	

	public String validUser() {
		if ("Esprit".equals(login) && "Esprit".equals(password)) {
			profile = ("comiter membre");
			return "trainer/index?faces-redirect=true";

		}

		if (!"Esprit".equals(login)) {
			FacesMessage messageL = new FacesMessage("ERROR", "login incorrect");
			FacesContext.getCurrentInstance().addMessage("loginForm:username", messageL);
		}

		if (!"Esprit".equals(password)) {
			FacesMessage messageP = new FacesMessage("ERROR", "password incorrect");
			FacesContext.getCurrentInstance().addMessage("loginForm:password", messageP);
		}

		return null;

	}

	public String submit() {
		return null;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

}
