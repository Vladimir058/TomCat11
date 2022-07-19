import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected  void  doGet(HttpServletRequest req, HttpServletResponse resp)
        throws  SecurityException, IOException{
        String param1 = req.getParameter("param1");
        String param2 = req.getParameter("param2");
        int i1 = Integer.parseInt(param1);
        int i2 = Integer.parseInt(param2);

        PrintWriter writer1 = resp.getWriter();
        writer1.println("<h1>Answer when multiplying numbers</h1>" + i1 +" and "
                + i2 + " = " + i1 *i2);


    }
}
