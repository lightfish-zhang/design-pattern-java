public class UserDAO {

    public int getPermission(String account, String password) {
        if ("Tony".equals(account) && "Tony".equals(password)) {
            return 0;
        }
        if ("Mike".equals(account) && "Mike".equals(password)) {
            return 1;
        }
        if ("Jame".equals(account) && "Jame".equals(password)) {
            return 2;
        }
        return -1;
    }
}