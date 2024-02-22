package mobile.config.builders;

public class LoginCredentialsBuilder {
    private String username;
    private String password;

    private LoginCredentialsBuilder() {
        this.username = System.getProperty("username");
        this.password = System.getProperty("password");
    }

    public static LoginCredentialsBuilder fromSystemProperties() {
        return new LoginCredentialsBuilder();
    }

    public LoginCredentials build() {
        return new LoginCredentials(username, password);
    }
}