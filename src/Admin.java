public class Admin extends Client {

    public Admin(ClientBuilder builder) {
        super(builder);
    }

    public void setLogin(String login) {
        super.setLogin(login);
    }

    public String getLogin() {
        return super.getLogin();
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    public String getId() {
        return super.getId();
    }

    public String getEmail() {
        return super.getEmail();
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public String getPhone() {
        return super.getPhone();
    }

    public void setPhone(String phone) {
        super.setPhone(phone);
    }

    public ClientType getClientType() {
        return super.getClientType();
    }

}
