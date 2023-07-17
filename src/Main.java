public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Visitor visitor = new Visitor();

        admin.login();
        visitor.login();
    }
}