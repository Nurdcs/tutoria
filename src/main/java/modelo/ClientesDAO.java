package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controlador.Conexion;



public class ClientesDAO {
	PreparedStatement ps=null;
	ResultSet rs=null;
	Conexion con= new Conexion();
	Connection cnn=con.conexiondb();
	ClientesDTO clidto;
	ClientesDTO cli;
	
	
	 public ClientesDTO consultarcliente(ClientesDTO cli) {
			try {
				ps=cnn.prepareStatement("SELECT * FROM clientes WHERE doccli=?");
				ps.setString(1, cli.getDoccli());
				rs=ps.executeQuery();
				if(rs.next()){
				 clidto=new ClientesDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						 rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
					  
			return clidto;  
		  }
	
	

public ArrayList<ClientesDTO> consultageneralclientes(){
    ArrayList<ClientesDTO> lista=new ArrayList<>();
    try {
        ps=cnn.prepareStatement("SELECT * FROM usuarios");
        rs=ps.executeQuery();
        while(rs.next()){
           
            cli=new ClientesDTO(rs.getString(1), rs.getString(2),rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(6));
            
            lista.add(cli);
        }
        
    } catch (SQLException ex) {
        System.out.println("Error en la consulta "+ex);
    }
  return lista;
}

}

