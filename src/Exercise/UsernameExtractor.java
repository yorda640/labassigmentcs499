package Exercise;

public class UsernameExtractor {

    public String extractFirstName(String username) {
        int underscoreIndex = username.indexOf('_');
        if (underscoreIndex != -1) {
            return username.substring(0, underscoreIndex);
        } else {
            // Handle cases where the username format is incorrect
            System.out.println("Invalid username format: " + username);
            return "";
        }
    }

    public String extractLastName(String username) {
        int underscoreIndex = username.indexOf('_');
        if (underscoreIndex != -1) {
            return username.substring(underscoreIndex + 1);
        } else {
            // Handle cases where the username format is incorrect
            System.out.println("Invalid username format: " + username);
            return "";
        }
    }

    public void displayUsernames(String[] usernames) {
        for (String username : usernames) {
            String firstName = extractFirstName(username);
            String lastName = extractLastName(username);
            System.out.println("Username: " + username + ", First Name: " + firstName + ", Last Name: " + lastName);
        }
    }

    public static void main(String[] args) {
        String[] usernames = {"john_doe", "jane_smith", "bob_johnson"};
        UsernameExtractor usernameExtractor = new UsernameExtractor();
        usernameExtractor.displayUsernames(usernames);
    }
}

