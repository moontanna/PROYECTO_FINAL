package src;

import java.sql.*;
public class CONECTA {
	private String url1 ;
	private  String user;
	private  String password ;
    private ResultSet myRs;

    public CONECTA() {
   	 url1 = "\"postgresql://postgres.phxwmwznpuxrjhnftbid:[@Janaminecraftera1]@aws-1-us-east-1.pooler.supabase.com:6543/postgres?pgbouncer=true\"";
        user = "root";
        password = "";	
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

   public ResultSet getClientes(int id) {
   		
   		try {
   			Connection   MyConn = DriverManager.getConnection(url1, user, password);
   		     Statement myStmt  = MyConn.createStatement();
   	         myRs=  myStmt.executeQuery("SELECT * FROM CLIENTES WHERE idclientes ="+id);
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
   	
   	public boolean InsertaFecha(String nombre,int precio,String categoria, int existencia) {
   		 try {
   			 Connection MyConn = DriverManager.getConnection(url1, user, password);
   			 Statement myStmt  = MyConn.createStatement();
   			 String sql = "Insert into productos"
   			 		+ "(nombre,precio,categoria,existencia) "
   			 		+ "values('"+ nombre+"',"+precio+",'"+categoria+"',"+existencia+")";
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
   	
   	public boolean Actualiza(String nombre,int precio,String categoria, int existencia, int id) {
   		 try {
   			 Connection MyConn = DriverManager.getConnection(url1, user, password);
   			 Statement myStmt  = MyConn.createStatement();
   			 String sql = "Update productos set nombre='"+nombre+"',"
   			 		+ " precio="+precio+",categoria='"+categoria+"',"
   			 				+ "existencia="+existencia+" Where idProducto="+id;
   		     myStmt.executeUpdate(sql);
   		     return true;
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   			return false;
   		}
   		 

   	     
   	}
   }
