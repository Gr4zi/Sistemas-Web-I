//SWII5 - TP02 - Alunos: Grazielle e Josuel - Prof Tuler

package gerenciador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Produtos> lista=new ArrayList<>();
	private static Integer chavesequencial=1;
	
	static {
		
		Produtos produto1=new Produtos();
		produto1.setCd(chavesequencial++);
		produto1.setNome("Chocolate");
		produto1.setDescricao("Barra 90g");
		produto1.setUnidadeCompra(1);
		produto1.setPrecoMaxComprado(3);
		produto1.setQtdPrevistoMes(24);
		lista.add(produto1);
		
		Produtos produto2=new Produtos();
		produto2.setCd(chavesequencial++);
		produto2.setNome("Salgadinho");
		produto2.setDescricao("Pacote 50g");
		produto2.setUnidadeCompra(1);
		produto2.setPrecoMaxComprado(1.5);
		produto2.setQtdPrevistoMes(30);
		lista.add(produto2);
		
	}
	
	public void adiciona(Produtos produto) {		
		produto.setCd(Banco.chavesequencial++);
		Banco.lista.add(produto);		
	}
	
	public List<Produtos> getProdutos(){
		return Banco.lista;
	}
	
	public void RemoveProduto(Integer cd) {
		Iterator<Produtos> it=lista.iterator();
		
		while(it.hasNext()) {
			Produtos emp=it.next();
			
			if(emp.getCd()==cd) {
				it.remove();
			}
		}		
	}
	
	public Produtos buscaProdutoPeloCd(Integer cd) {
		for(Produtos produto:lista) {
			if(produto.getCd()==cd) {
				return produto;
			}
		}
		return null;
	}
	
}
