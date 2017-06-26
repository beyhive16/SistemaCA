package br.com.cacomp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cacomp.conexao.Conexao;
import br.com.cacomp.domain.Administradores;
import br.com.cacomp.domain.Alunos;

public class AlunosDAO {
	
	public void salvar(Alunos aln) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO Alunos ");
		sql.append("(matricula, nome)");
		sql.append("VALUES (?,?)");

		Connection conexao = Conexao.conectar();

		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		
		comando.setInt(1, aln.getMatricula());
		comando.setString(2, aln.getNome());
		comando.executeUpdate();
	}
}