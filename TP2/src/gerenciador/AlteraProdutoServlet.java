//SWII5 - TP02 - Alunos: Grazielle e Josuel - Prof Tuler

package gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AlteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Alterando Produto");
		
		String paramCd=request.getParameter("cd");
		Integer cd=Integer.valueOf(paramCd);
		String nomeProduto=request.getParameter("nome");
		String descricaoProduto=request.getParameter("descricao");
		String paramunidadeCompra=request.getParameter("unidadeCompra");
		int unidadeCompra=Integer.parseInt(paramunidadeCompra);
		String paramQtdePrevistoMes=request.getParameter("qtdPrevistoMes");
		double qtdePrevistoMes=Double.parseDouble(paramQtdePrevistoMes);
		String paramPrecoMaxComprado=request.getParameter("precoMaxComprado");
		double precoMaxComprado=Double.parseDouble(paramPrecoMaxComprado);
		
		System.out.println(cd);
		Banco banco=new Banco();
		Produtos produto=banco.buscaProdutoPeloCd(cd);
		produto.setNome(nomeProduto);
		produto.setDescricao(descricaoProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setQtdPrevistoMes(qtdePrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		response.sendRedirect("ListaProdutos");
		
	}

}
