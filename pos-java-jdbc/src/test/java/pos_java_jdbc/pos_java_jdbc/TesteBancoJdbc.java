package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		// SingleConnection.getConnection();

		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();

		userposjava.setNome("Lucas");
		userposjava.setEmail("lucas@gmail.com");

		userPosDAO.salvar(userposjava);

	}

	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			System.out.println("Iniciou a lista com  sucesso\n");

			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("---------------------------------------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();

		try {
			Userposjava userposjava = dao.buscar(9L);
			System.out.println("Realizou a busca com sucesso\n");

			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void initAtualizar() {

		try {

			UserPosDAO dao = new UserPosDAO();

			Userposjava objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Nome alterado com o metodo atualizar");

			dao.atualizar(objetoBanco);
			System.out.println("Atualizou registro com  sucesso\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void initDeletar() {
		try {

			UserPosDAO dao = new UserPosDAO();
			dao.deletar(11L);
			System.out.println("Deletou com  sucesso\n");
		} catch (Exception e) {

		}
	}

	@Test
	public void testeInsertTelefone() {

		Telefone telefone = new Telefone();
		telefone.setNumero("(19)4445-4545");
		telefone.setTipo("Residencial");
		telefone.setUsuario(22L);

		UserPosDAO dao = new UserPosDAO();
		dao.salvarTelefone(telefone);

	}

	@Test
	public void testeCarregaFonesUser() {

		UserPosDAO dao = new UserPosDAO();

		List<BeanUserFone> beanUserFones = dao.listaUserFone(13L);

		for (BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
			System.out.println("---------------------------------------");

		}

	}

	@Test
	public void testeDeleteUserFone() {
		UserPosDAO dao = new UserPosDAO();
		dao.deleteFonePorUser(13L);
	}

}
