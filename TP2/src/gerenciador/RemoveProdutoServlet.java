//SWII5 - TP02 - Alunos: Grazielle e Josuel - Prof Tuler

package gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveProduto")
public class RemoveProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramCd=request.getParameter("cd");
		Integer cd=Integer.valueOf(paramCd);
		
		System.out.println(cd);
		
		Banco banco=new Banco();
		banco.RemoveProduto(cd);
		
		response.sendRedirect("ListaProdutos");
		
	}

}
