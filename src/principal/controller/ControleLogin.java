package principal.controller;

import principal.db.BancoDeDados;
import principal.modelo.Usuario;

public class ControleLogin {
	
public static Usuario usuarioLogado;
	
	public static boolean isUsuarioLogado(){
		return usuarioLogado != null;
	}	
		
		public static void autenticar(String login, String senha) {
			for (Usuario usuario : BancoDeDados.usuarios) {
				if (usuario.getLogin().equalsIgnoreCase(login) && usuario.getSenha().equalsIgnoreCase(senha)) {
				
					ControleLogin.usuarioLogado = usuario;
					break;
				}else {
					System.out.println();
				}
			}
	
		}

}
