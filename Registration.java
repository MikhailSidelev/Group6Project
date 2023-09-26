package GroupProject;

public class Registration {
    private String email;
    private String userName;
    private String password;

    // Method to set the user's email
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Email must be from Yahoo.");
        }
    }

    // Method to set the user's username
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username cannot be empty and should be at least 7 characters.");
        }
    }

    // Method to set the user's password
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password cannot be empty, should be at least 7 characters, and should not contain the username.");
        }
    }

    // Check if the email is valid (Yahoo)
    private boolean isValidEmail(String email) {
        return email != null && email.endsWith("@yahoo.com");
    }

    // Check if the username is valid (non-empty and at least 7 characters)
    private boolean isValidUserName(String userName) {
        return userName != null && userName.length() > 6;
    }

    // Check if the password is valid (non-empty, at least 7 characters, and doesn't contain the username)
    private boolean isValidPassword(String password) {
        return password != null && password.length() > 6 && !password.contains(userName);
    }

    public static void main(String[] args) {
        Registration user = new Registration();

        user.setEmail("example@yahoo.com");
        user.setUserName("myUsername");
        user.setPassword("myPassword123");

        // Invalid cases
        user.setEmail("invalid@gmail.com"); // Should print "Invalid email format. Email must be from Yahoo."
        user.setUserName("short"); // Should print "Invalid username. Username cannot be empty and should be at least 7 characters."
        user.setPassword("invalidPassword"); // Should print "Invalid password. Password cannot be empty, should be at least 7 characters, and should not contain the username."
    }
}





