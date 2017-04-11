package br.edu.iffarroupilha.bolicho.controle;

import br.edu.iffarroupilha.bolicho.modelo.Produto;

/**
*<p>
*Classe que concentra as logica ligadas para a entidade produto
*</p>
**/
public class ProdutoControle extends AControle{
	
	/**
	 * <p>
	 * Valida se os dados do cliente estão corretos
	 * </p>
	 * @param cli
	 * @return
	 */
	public String validarProduto(Produto Pre){
		if (Pre != null) {
			if (Pre.getPreco() == 0) {
				return "Informe o preço";
			} else if(Pre.getDescricao() == null || Pre.getDescricao().isEmpty()){
				return "Por favor, informe uma descrição ao produto";
			}
		} else {
			return "Dados do produto não informado!";
		}
		return null;
	}


}