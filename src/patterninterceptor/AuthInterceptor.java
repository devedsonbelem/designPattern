package patterninterceptor;

import java.util.HashMap;
import java.util.Map;

public class AuthInterceptor {
    private Map<String, Users> tokenToUser = new HashMap<>();


    public boolean isAuthorized(String token) {
        return tokenToUser.containsKey(token);
    }


    public void addAuthorizedUser(Users user) {
        tokenToUser.put(user.getToken(), user);
    }
}