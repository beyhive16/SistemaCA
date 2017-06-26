package br.com.cacomp.teste;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import br.com.cacomp.DAO.AlunosDAO;
import br.com.cacomp.domain.Alunos;

public class AlunosDAOteste {

	@Test
	public void salvar() throws SQLException{
		Alunos aln1 = new Alunos();
		
		aln1.setMatricula(1053255);
		aln1.setNome("Raquel Batista de Melo");

		AlunosDAO alnDAO = new AlunosDAO();
		try {
			alnDAO.salvar(aln1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
