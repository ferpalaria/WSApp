package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import model.Pessoa;

public class SelectPessoa {

	
	public ArrayList<Pessoa> selectAllPessoa(){
		
		ArrayList<Pessoa> listPessoa = new ArrayList<>();

		try {
			
			ConnectorMySQL cms = new ConnectorMySQL();
			Connection conn = cms.connect();
			
			PreparedStatement ps = (PreparedStatement)conn.prepareStatement("SELECT * from pessoa");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				Pessoa pessoa = new Pessoa();
			
				pessoa.setNome(rs.getString("nome"));
				pessoa.setIdade(Integer.parseInt(rs.getString("idade")));
				
				listPessoa.add(pessoa);
			}
		
			cms.close(conn);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return listPessoa;
	}
	
}
