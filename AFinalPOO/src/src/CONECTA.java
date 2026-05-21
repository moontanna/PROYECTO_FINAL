package src;

import java.sql.*;
public class CONECTA {
	private String url1 ;
	private  String user;
	private  String password ;
    private ResultSet myRs;

    public CONECTA() {
   	 url1 = "jjdbc:postgresql://db.phxwmwznpuxrjhnftbid.supabase.co:5432/PROYECTOfinal";
        user = "postgres";
        password = "@Janaminecraftera1";	
   }
   public String getUser() {
   	return user;
   }

   public void setUser(String user) {
   	this.user = user;
   }
   	
   public ResultSet getMyRs() {
   		
   		try {
   			Connection   MyConn = DriverManager.getConnection(url1, user, password);
   		     Statement myStmt  = MyConn.createStatement();
   	         myRs=  myStmt.executeQuery("select * from PROYECTOfinal");
   	      
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		return myRs;
   	}
   public ResultSet getFecha() {
   		
   		try {
   			Connection   MyConn = DriverManager.getConnection(url1, user, password);
   		     Statement myStmt  = MyConn.createStatement();
   	         myRs=  myStmt.executeQuery("Select * from fecha)");
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		return myRs;
   		
   	}
   public ResultSet getnotas() {
  		
  		try {
  			Connection   MyConn = DriverManager.getConnection(url1, user, password);
  		     Statement myStmt  = MyConn.createStatement();
  	         myRs=  myStmt.executeQuery("Select * from notas)");
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return myRs;
  		
  	}
   
   public ResultSet gettiempo() {
  		
  		try {
  			Connection   MyConn = DriverManager.getConnection(url1, user, password);
  		     Statement myStmt  = MyConn.createStatement();
  	         myRs=  myStmt.executeQuery("Select * from tiempo)");
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return myRs;
  		
  	}

   public ResultSet getimagenes(int respuesta) {
   		
   		try {
   			Connection   MyConn = DriverManager.getConnection(url1, user, password);
   		     Statement myStmt  = MyConn.createStatement();
   	         myRs=  myStmt.executeQuery("SELECT * FROM imagenes WHERE link ="+respuesta);
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		finally {
   			
   		}
   		return myRs;
   	}
   	public void setMyRs(ResultSet myRs) {
   		this.myRs = myRs;
   	}
   	
   	public boolean InsertaFecha(String dia,int mes, int anio) {
   		 try {
   			 Connection MyConn = DriverManager.getConnection(url1, user, password);
   			 Statement myStmt  = MyConn.createStatement();
   			 String sql = "Insert into fecha"
   			 		+ "(dia,mes,anio) "
   			 	+ "values('"+ dia+"','"+mes+"','"+anio+"')";
   		     myStmt.executeUpdate(sql);
   		     return true;
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   			return false;
   		}
   	     
   	}
   	public boolean eliminaProducto(int id) {
   		try {
   			 Connection MyConn = DriverManager.getConnection(url1, user, password);
   			 Statement myStmt  = MyConn.createStatement();
   			
   			 String sql = "Delete from productos Where idProducto="+id;
   		     myStmt.executeUpdate(sql);
   		     return true;
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   			return false;
   	    }
   	
   	
   

   	     
   	}
   	public boolean Inserta(String evento, String dia, String mes,
            String anio, String hora, String minutos) {

try {

Connection MyConn = DriverManager.getConnection(url1, user, password);

	Statement myStmt = MyConn.createStatement();

	String sql = "INSERT INTO fecha(evento,dia,mes,anio,hora,minutos) VALUES('"+ evento + "','"+ dia + "','"+ mes + "','"+ anio + "','"+ hora + "','"+ minutos + "')";

	myStmt.executeUpdate(sql);

	return true;

	} catch (SQLException e) {

		e.printStackTrace();
		return false;
}
}
	
		
		
	
	
   }
