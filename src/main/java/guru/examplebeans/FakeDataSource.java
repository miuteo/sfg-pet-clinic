package guru.examplebeans;

public class FakeDataSource {
    private String user;
    private String password;
    private String url;
    private String jmsUser;
    private String jmsPassword;
    private String jmsUrl;

    public String getUser() {

        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJmsUser() {
        return jmsUser;
    }

    public void setJmsUser(String jmsUser) {
        this.jmsUser = jmsUser;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
