package guru.springframework.sfgdi.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jdburl;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdburl() {
        return jdburl;
    }

    public void setJdburl(String jdburl) {
        this.jdburl = jdburl;
    }
}
