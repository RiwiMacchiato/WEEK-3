package Day2.Activity10;

import java.util.HashMap;
import java.util.Map;

public class SimpleRouter {

    private Map<String, Runnable> routes = new HashMap<>();

        public SimpleRouter() {
            routes.put("/home", () ->System.out.println("Bienvenido a Home"));
            routes.put("/about", () -> System.out.println("Pagina About: informacion sobre nosotros "));
            routes.put("/contact", () -> System.out.println("Pagina de Contacto: contactanos "));

        }

        public void handleRequest(String path) {
            Runnable action = routes.get(path);

            if (action != null) {
                action.run();
            } else {
                System.out.println("404 - Ruta no encontrada ");
            }
        }


}
