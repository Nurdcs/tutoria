package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import modelo.ClientesDAO;
import modelo.ClientesDTO;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 String doc,nom;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out=response.getWriter();
	  
	   ArrayList<ClientesDTO> lista=new ArrayList<ClientesDTO>();
		ClientesDAO clidao=new ClientesDAO();
		ClientesDTO cli=new ClientesDTO();
		lista=clidao.consultageneralclientes();
		/*for(int i=0; i<lista.size(); i++) {
			cli=lista.get(i);
			 doc= cli.getDoccli();
			 nom=cli.getNomcli();
			
			
		}*/
		
		
		//String nombre="Maria";
		/*out.print(doc);
		out.print(nom);
		String dato=request.getParameter("yy");
		
		out.println(dato);*/
	  
	   Gson gjon=new Gson();
	   out.print(gjon.toJson(lista));
		
		
		
		
		
		
		
	}

}
