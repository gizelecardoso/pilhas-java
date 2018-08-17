
public class TesteConexao {

	public static void main(String[] args) {

		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		// ---------------------- código complexo
		
//		Conexao con=null;
//		try {			
//			con = new Conexao();
//			con.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conxeão");
//		}finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//			
//		}
		
	}

}
