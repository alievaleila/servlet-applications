import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setCharacterEncoding("UTF-16");

        String name = req.getParameter("name");
        System.err.println(">>>"+name);
        String name2=req.getParameter("name");
        System.err.println(">>>"+name2);
        req.getParameterMap().forEach((key,value)->System.out.println(key+" "+ Arrays.toString(value)));
        String msg = String.format("Hello %s", name != null ? name : "World");
        resp.getWriter().print(msg);
    }
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException{
        resp.getWriter().print("I took");
    }
}
