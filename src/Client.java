import java.util.UUID;

public abstract class Client {

    private ClientType clientType = ClientType.USER;
    private String login;
    private String password;
    private String id = UUID.randomUUID().toString();
    private String email; //optional field
    private String phone; //optional field


    public Client(ClientBuilder builder) {
        this.clientType = builder.getClientType();
        this.login = builder.getLogin();
        this.password = builder.getPassword();
        this.email = builder.getEmail();
        this.phone = builder.getPhone();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientType=" + clientType +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
