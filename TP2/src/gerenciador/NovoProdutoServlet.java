//SWII5 - TP02 - Alunos: Grazielle e Josuel - Prof Tuler

package gerenciador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NovoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Cadastrando novo produto");
		
		String nomeProduto=request.getParameter("nome");
		String descricaoProduto=request.getParameter("descricao");
		String paramunidadeProduto=request.getParameter("unidadeCompra");
		int unidadeProduto=Integer.parseInt(paramunidadeProduto);
		String paramqtdemesProduto=request.getParameter("qtdPrevistoMes");
		double qtdemesProduto=Double.parseDouble(paramqtdemesProduto);
		String paramprecoProduto=request.getParameter("precoMaxComprado");
		double precoProduto=Double.parseDouble(paramprecoProduto);
		
		Produtos produto=new Produtos();
		produto.setNome(nomeProduto);
		produto.setDescricao(descricaoProduto);
		produto.setUnidadeCompra(unidadeProduto);
		produto.setPrecoMaxComprado(precoProduto);
		produto.setQtdPrevistoMes(qtdemesProduto);
		
		Banco banco=new Banco();
		banco.adiciona(produto);
		
		request.setAttribute("produto", produto.getNome());
		
		response.sendRedirect("ListaProdutos");
		
	}

}
