package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;

@WebServlet("/CtrrAluno")
public class CtrAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CtrAluno() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Servlet adicionado pelo aluno.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String ra = request.getParameter("ra");
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String sexo = request.getParameter("sexo");
		String cmd = request.getParameter("cmd");
		@SuppressWarnings("unchecked")
		List<Aluno> lista = (List<Aluno>) getServletContext().getAttribute("Lista");
		
		if("Adicionar".equals(cmd)){
			Aluno al = new Aluno();
			al.setId(Long.parseLong(id));
			al.setRa(ra);
			al.setNome(nome);
			al.setIdade(Integer.parseInt(idade));
			al.setSexo(sexo);
			
			lista.add(al);
			response.sendRedirect("./aluno.jsp");
			System.out.println("Adicionado com sucesso");
		} 
		
		else if("Remover".equals(cmd)){
			Aluno al = new Aluno();
			al.setId(Long.parseLong(id));
			
			lista.remove(al);
			response.sendRedirect("./aluno.jsp");
			System.out.println("Removido com sucesso");
		} 
		
		else if("Atualizar".equals(cmd)){
//			Aluno al = new Aluno();
//			al.setId(Long.parseLong(id));
//			al.setRa(ra);
//			al.setNome(nome);
//			al.setIdade(Integer.parseInt(idade));
//			al.setSexo(sexo);
//			
//		} else if("Pesquisar".equals(cmd)){
//	
//			for (Aluno aluno : lista) {
//				if(aluno.getId().)
//			}
		}
	}

}
