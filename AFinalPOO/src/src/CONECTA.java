package src;

import java.sql.*;



public class CONECTA {
	
	

	
			static String url1 = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:6543/postgres";
            static String user = "postgres.phxwmwznpuxrjhnftbid";
            static String password = "o7Sp7ifonr29L5D6";
            public static Connection getConnection() throws Exception {
        		Class.forName("org.postgresql.Driver");
        		return DriverManager.getConnection(url1, user, password);
        	}

        	public static void main(String[] args) {
        		try {

        			Connection MyConn = getConnection();
        			Statement myStmt = MyConn.createStatement();
        			ResultSet myRs = myStmt.executeQuery("select * from fecha");
        			while(myRs.next()) {
        				System.out.println(myRs.getString("evento"));
        			}

        		} catch(Exception e) {
        			e.printStackTrace();
        		}
        	}
		


        	public ResultSet getFechas() {
        	    try {
        	        // Usamos las variables url1, user y password que ya definiste en la clase
        	        Connection MyConn = DriverManager.getConnection(url1, user, password);
        	        // IMPORTANTE: TYPE_SCROLL_INSENSITIVE para que funcione .previous()
        	        Statement myStmt = MyConn.createStatement(
        	            ResultSet.TYPE_SCROLL_INSENSITIVE, 
        	            ResultSet.CONCUR_READ_ONLY
        	        );
        	        return myStmt.executeQuery("select * from fecha");
        	    } catch (SQLException e) {
        	        e.printStackTrace();
        	        return null; // Si falla, devuelve null
        	    }
        	}

	public boolean guardarFecha(String evento, int dia, String mes,
			String anio, String hora, String minutos) {

				try {
					 String url1 = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:6543/postgres";
			            String user = "postgres.phxwmwznpuxrjhnftbid";
			            String password = "o7Sp7ifonr29L5D6";
					Connection MyConn =DriverManager.getConnection(url1, user, password);

					Statement myStmt = MyConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

					String sql = "Insert into fecha "
							+ "(evento,dia,mes,anio,hora,minutos) "
							+ "values('"+evento+"',"+dia+",'"
							+ mes+"','"+anio+"','"
							+ hora+"','"+minutos+"')";

					myStmt.executeUpdate(sql);

					return true;

				} catch(SQLException e) {

					e.printStackTrace();

					return false;
				}
			}
	
	public boolean borrarFecha(String evento,int dia, String mes,
			String anio, String hora, String minutos) {
	    try {
	        String url1 = "jdbc:postgresql://aws-1-us-east-1.pooler.supabase.com:6543/postgres";
	        String user = "postgres.phxwmwznpuxrjhnftbid";
	        String password = "o7Sp7ifonr29L5D6";
	        Connection MyConn = DriverManager.getConnection(url1, user, password);
	        
	        Statement myStmt = MyConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	        
	        String sql = "DELETE FROM fecha "+ "WHERE evento='" + evento + "'"+ " AND dia=" + dia+ " AND mes='" + mes + "'" + " AND anio='" + anio + "'"
	                + " AND hora='" + hora + "'"
	                + " AND minutos='" + minutos + "'";
	        
	        
	        myStmt.executeUpdate(sql);
	        
	        
	        return true;
	        
	        
	        
	    } catch(SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	public boolean borrarNota(String nota) {
	    try {
	        Connection MyConn = DriverManager.getConnection(url1, user, password);
	        Statement myStmt = MyConn.createStatement();
	        
	        String sql = "DELETE FROM notas "
	                + "WHERE texto='" + nota + "'";
	        
	        myStmt.executeUpdate(sql);
	        return true;
	        
	        
	    } catch(SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	public boolean guardarNota(String nota) {

		try {

			Connection MyConn = DriverManager.getConnection(url1,user,password);
			Statement myStmt = MyConn.createStatement();
			String sql = "insert into notas (texto) "
			+ "values('"+nota+"')";
			System.out.println(sql);
			
			myStmt.executeUpdate(sql);
			return true;

		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		}}
	
	
	
		public ResultSet getNotas() {
		    try {
		        Connection MyConn = DriverManager.getConnection(url1, user, password);
		        Statement myStmt = MyConn.createStatement(
		            ResultSet.TYPE_SCROLL_INSENSITIVE, 
		            ResultSet.CONCUR_READ_ONLY
		        );
		        
		        // AL PEDIR "texto" PRIMERO, EL ÍNDICE 1 SIEMPRE SERÁ TU NOTA
		        return myStmt.executeQuery("SELECT texto FROM notas"); 
		        
		    } catch (SQLException e) {
		        e.printStackTrace();
		        return null;
		    }
	}
	
	
	
	}

	