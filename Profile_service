class ProfileService {
    private Map<String, String> userDatabase = new HashMap<>(); // Stores username and password

    public boolean register(String username, String password) {
        if (userDatabase.containsKey(username)) return false;
        userDatabase.put(username, encryptPassword(password));
        return true;
    }

    public boolean login(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(encryptPassword(password));
    }

    private String encryptPassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes()); // Simple encryption
    }
}
