package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

@WebServlet("/cadastro")
public class ViagensServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		String email = req.getParameter("email");
		String genero = req.getParameter("genero");
		int numero = Integer.parseInt(req.getParameter("numero"));
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nome);
		pessoa.setSobrenome(sobrenome);
		pessoa.setEmail(email);
		pessoa.setGenero(genero);
		pessoa.setNumero(numero);
		
		String resultado = null;
		
		switch (genero) {
		case "masc":
				resultado = "Sr.";
			break;
		case "fem":
				resultado = "Sra.";
			break;
		default:
			break;
		}
		
		
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH");
		System.out.println(LocalDateTime.now());
		int tempo = Integer.parseInt(fmt.format(LocalDateTime.now()));
		
		String dia;
		if(tempo < 12) {
			dia = "Bom dia";
		} else if(tempo < 18) {
			dia = "Boa tarde";
		} else {
			dia = "Boa noite";
		}
		
		String mensagem = null;
		if(numero < 10) {
			mensagem = "Hoje é seu dia de sorte, parabéns!!";
		} else if(numero < 20) {
			mensagem = "Hoje não é seu dia de sorte, que triste";
		} else if (numero < 500) {
			mensagem = "OK, obrigado por testar. TCHAU!!";
		}
		
		req.setAttribute("mensagem", mensagem);
		req.setAttribute("dia", dia);
		req.setAttribute("resultado", resultado);
		/*req.setAttribute("nome", nome);
		req.setAttribute("sobrenome", sobrenome);  
		req.setAttribute("email", email);
		req.setAttribute("sexo", sexo);
		req.setAttribute("numero", numero);*/
		req.setAttribute("pessoa", pessoa);
		req.getRequestDispatcher("/resultado.jsp").forward(req, resp);
		
	}
	

}
