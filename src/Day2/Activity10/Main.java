package Day2.Activity10;

import java.util.HashMap;

public class Main {

    public static void main (String[] args) {

       SimpleRouter router = new SimpleRouter();

       router.handleRequest("/home");
       router.handleRequest("/about");
       router.handleRequest("/contact");
       router.handleRequest("/invalid");



    }
}

