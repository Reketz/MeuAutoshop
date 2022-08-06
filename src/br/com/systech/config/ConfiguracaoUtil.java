package br.com.systech.config;

public class ConfiguracaoUtil {

	private String userNameBD;
	private String passwordBD;
        private String portBD;
        private String urlBD;
        private String hostBD;

	public ConfiguracaoUtil() {
		super();
		this.userNameBD = "";
                this.passwordBD = "";
                this.portBD = "";
                this.urlBD = "";
                this.hostBD = "";
	}

    public String getUserNameBD() {
        return userNameBD;
    }

    public void setUserNameBD(String userNameBD) {
        this.userNameBD = userNameBD;
    }

    public String getPasswordBD() {
        return passwordBD;
    }

    public void setPasswordBD(String passwordBD) {
        this.passwordBD = passwordBD;
    }

    public String getPortBD() {
        return portBD;
    }

    public void setPortBD(String portBD) {
        this.portBD = portBD;
    }

    public String getUrlBD() {
        return urlBD;
    }

    public void setUrlBD(String urlBD) {
        this.urlBD = urlBD;
    }

    public String getHostBD() {
        return hostBD;
    }

    public void setHostBD(String hostBD) {
        this.hostBD = hostBD;
    }

    @Override
    public String toString() {
        return "ConfiguracaoUtil{" + "userNameBD=" + userNameBD + ", passwordBD=" + passwordBD + ", portBD=" + portBD + ", urlBD=" + urlBD + ", hostBD=" + hostBD + '}';
    }

}
