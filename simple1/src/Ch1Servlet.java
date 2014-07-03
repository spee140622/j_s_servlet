import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @version 1.5
 *          Created by wenzhouyang on 7/3/2014.
 */
public class Ch1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Date today = new Date();
        out.println("<html>" +
                "<body>" +
                "<h1 align=center>Hf\'s <br/>" + today + "</body></html>");
    }
}
