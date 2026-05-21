package src;

import java.sql.*;



public class CONECTA {
	private String url1 ;
	private  String user;
	private  String password ;
    private ResultSet myRs;

    public CONECTA() {
   	 url1 = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:6543/postgres?user=postgres.phxwmwznpuxrjhnftbid&password=[@Janaminecraftera1]";
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
   	         myRs=  myStmt.executeQuery("Select * from fecha");
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
  	         myRs=  myStmt.executeQuery("Select * from notas");
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
  	         myRs=  myStmt.executeQuery("Select * from tiempo");
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return myRs;
  		
  	}

   public ResultSet getimagenes(int respuesta) {
	    try {
	        Connection myConn = DriverManager.getConnection(url1, user, password);

	        PreparedStatement ps = myConn.prepareStatement(
	            "SELECT * FROM imagenes WHERE link = ?"
	        );
	        ps.setInt(1, respuesta);

	        return ps.executeQuery(); 
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
   	
   	public boolean InsertaFecha(int dia,int mes, int anio, String evento) {
   		 try {
   			 Connection MyConn = DriverManager.getConnection(url1, user, password);
   			 Statement myStmt  = MyConn.createStatement();
   			 String sql = "Insert into fecha"
   			 		+ "dia,mes,anio,evento "
   			 	+ "values('"+ evento+"','"+ dia+"','"+mes+"','"+anio+"')";
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






	public boolean Inserta(String evento, int dia, String mes, String anio, String hora, String minutos) {
		// TODO Auto-generated method stub
		return false;
	}
	
		
		
	
	
   }
