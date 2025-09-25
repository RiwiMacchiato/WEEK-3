import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        HashMap<String, Runnable> routes = new HashMap<>();

        // Define routes with their corresponding actions
        routes.put("/home", () -> System.out.println("Welcome to the Home page!"));
        routes.put("/about", () -> System.out.println("About Us - Learn more about our company"));
        routes.put("/contact", () -> System.out.println("Contact Us - Get in touch with our team"));

        // Simulate requests
        String[] requests = {"/home", "/about", "/nonexistent", "/contact"};

        for (String request : requests) {
            System.out.println("Request: " + request);
            Runnable route = routes.get(request);
            if (route != null) {
                route.run();
            } else {
                System.out.println("404 - Route not found");
            }
            System.out.println();
        }
    }
}
