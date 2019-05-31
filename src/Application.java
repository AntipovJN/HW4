public class Application {
    public static void main(String[] args) {
        Client clientAdmin = ClientBuilder.getCleintBuilder("admin", "password")
                .setClientType(ClientType.ADMIN).setEmail("mail@mate.com").build();
        System.out.println(clientAdmin.toString() + " Class of Client = " + clientAdmin.getClass());
        Client clientUser = ClientBuilder.getCleintBuilder("user", "user_pass").setPhone("+380...").build();
        System.out.println(clientUser.toString() + " Class of Client = " + clientUser.getClass());
        try {
            System.out.println(sqrt(-9));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    //task 1
    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }
}
