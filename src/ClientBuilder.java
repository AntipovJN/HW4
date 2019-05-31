public class ClientBuilder {

    private static ClientBuilder clientBuilder;
    private ClientType clientType = ClientType.USER;
    private String login;
    private String password;
    private String email = "not specified"; //optional field
    private String phone = "not specified"; //optional field

    public static ClientBuilder getCleintBuilder(String login, String password) {
        if (clientBuilder == null) {
            clientBuilder = new ClientBuilder();
            clientBuilder.setLoginAndPass(login, password);
        }
        clientBuilder.setLoginAndPass(login, password);
        return clientBuilder;
    }

    private ClientBuilder() {
    }

    public Client build() {
        if (this.clientType == ClientType.ADMIN) {
            return new Admin(this);
        }
        return new User(this);
    }

    public ClientType getClientType() {
        return clientType;
    }

    public ClientBuilder setClientType(ClientType clientType) {
        this.clientType = clientType;
        return this;
    }

    public String getLogin() {
        return login;
    }

    private ClientBuilder setLoginAndPass(String login, String password) {
        this.login = login;
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }


    public String getEmail() {
        return email;
    }

    public ClientBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ClientBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }


}
