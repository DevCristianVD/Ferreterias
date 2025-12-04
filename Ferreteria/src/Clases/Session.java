package Clases;

public class Session {
    private static Session instance; 

    private Session() {
    }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    private String userRole;
    private int userId;
    private String userName;


    public void login(String role, int id, String name) {
        this.userRole = role;
        this.userId = id;
        this.userName = name;
    }


    public void logout() {
        this.userRole = null;
        this.userId = 0;
        this.userName = null;
    }

    public String getRole() {
        return userRole;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    /**
     * Método útil para saber si hay una sesión activa.
     */
    public boolean isLoggedIn() {
        return userRole != null;
    }
}
