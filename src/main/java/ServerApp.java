import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {

    public static void main(String[] args) throws Exception{
        final Server server = new Server(8080);

        final ServletContextHandler handler = new ServletContextHandler();

        handler.addServlet(new ServletHolder(new InfoServlet()), "/info");
        handler.addServlet(new ServletHolder(new CalcServlet()), "/calc");
        handler.addServlet(new ServletHolder(new RestInPeaceServlet()), "/users");

        server.setHandler(handler);

        server.start();
        server.join();

    }
}
