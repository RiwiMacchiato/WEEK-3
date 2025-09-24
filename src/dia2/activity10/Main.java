package dia2.activity10;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Runnable> routes = new HashMap<>();
        routes.put("/home", new Home());
        routes.put("/about", new About());
        routes.put("/contact", new Contact());


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta: ");
        String route = scanner.nextLine();

        Runnable routeSelected = routes.get(route);

        if(routeSelected==null){
            new NotFound().printMessage();
        } else {
            routeSelected.printMessage();
        }

        scanner.close();

    }


}
