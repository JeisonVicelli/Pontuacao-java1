package principal.controller;

import principal.db.BancoDeDados;
import principal.modelo.Produto;

public class CadastroProduto {
	public static void adicionar(Produto produto) {
		BancoDeDados.produtos.add(produto);
	}

	public static void atualizar(int produtoAlterar, Produto produtoAlterado) {
		BancoDeDados.produtos.set(produtoAlterar, produtoAlterado);
	}
	
	public static void atualizar(String produtoOriginal, Produto produtoAlterado) {
		for (int i = 0; i < BancoDeDados.produtos.size(); i++) {
			Produto produto = BancoDeDados.produtos.get(i);
			if (produto.nome.equalsIgnoreCase(produtoOriginal)) {
				BancoDeDados.produtos.set(i, produtoAlterado);
				break;
			}
		}
	}

	public static Produto localizar(String nome) {
		Produto produtoLocalizado = null;
		for (Produto produto : BancoDeDados.produtos) {
			if (produto.nome.equalsIgnoreCase(nome)) {
				produtoLocalizado = produto;
				break;
			}
		}
		return produtoLocalizado;
	}

	public static boolean excluir(String nome) {
		boolean produtoExcluido = false;
		for (int i = 0; i < BancoDeDados.produtos.size(); i++) {
			Produto produto = BancoDeDados.produtos.get(i);
			if (produto.nome.equalsIgnoreCase(nome)) {
				BancoDeDados.produtos.remove(i);
				produtoExcluido = true;
				break;
			}
		}
		return produtoExcluido;
	}

}
