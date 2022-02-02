package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class ViagensServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		String email = req.getParameter("email");
		String sexo = req.getParameter("genero");
		int numero = Integer.parseInt(req.getParameter("numero"));
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nome);
		pessoa.setSobrenome(sobrenome);
		pessoa.setEmail(email);
		pessoa.setGenero(sexo);
		pessoa.setNumero(numero);
		
		
		switch (sexo) {
		case "masc":
				sexo = "Sr.";
			break;
		case "fem":
				sexo = "Sra.";
			break;

		default:
			break;
		}
		
		
		
		/*DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH");
		
		int hora = Integer.parseInt(fmt.format(LocalDate.now()));
		
		String dia;
		if(hora < 12) {
			dia = "Bom dia";
		} else if(hora < 18) {
			dia = "Boa tarde";
		} else {
			dia = "Boa noite";
		}
		
		
		req.setAttribute("dia", dia);*/
		req.setAttribute("nome", nome);
		req.setAttribute("sobrenome", sobrenome);
		req.setAttribute("email", email);
		req.setAttribute("sexo", sexo);
		req.setAttribute("pessoa", pessoa);
		req.setAttribute("numero", numero);
		req.getRequestDispatcher("/resultado.jsp").forward(req, resp);
		
	}
	

}
