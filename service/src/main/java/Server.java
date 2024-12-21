import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new BankService());
        System.out.println("web service deployed on http://localhost:9191/");
    }
}
