//SWII5 - TP02 - Alunos: Grazielle e Josuel - Prof Tuler

package gerenciador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListaProdutos")
public class ListaProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco=new Banco();
		List<Produtos> lista=banco.getProdutos();
		
		request.setAttribute("produtos", lista);
		
		RequestDispatcher rd=request.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(request, response);
		
	}

}
