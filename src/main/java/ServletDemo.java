import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo extends HttpServlet {
    @Override
    protected  void doGet (HttpServletRequest req, HttpServletResponse resp) throws  SecurityException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<h1> Russia<h1>");
        writer.write("Vladimir");
    }
}
