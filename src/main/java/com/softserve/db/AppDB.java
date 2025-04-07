package com.softserve.db;

import java.sql.*;

public class AppDB {

    public static void main(String[] args) throws SQLException {
        System.out.println("Start...");
        //
        //String connectionUrl = "jdbc:mysql://192.168.6.183:3306/test";
        //String username = "pmp2025";
        //String password = "Pmp#2025";
        //
        String connectionUrl = "jdbc:postgresql://20.84.121.230:5432/test01";
        String username = "test01";
        String password = "test01";
        //
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        //
        Connection con = DriverManager.getConnection(connectionUrl, username, password);
        if (con != null) {
            System.out.println("Connection Successful! \n");
        } else {
            System.out.println("Connection ERROR \n");
            System.exit(1);
        }
        Statement st = con.createStatement();
        //
		/* Create Database
		st.execute("CREATE DATABASE test;");
		*/
        //
		/* Create Table
		//st.execute("USE test;");
		//
		// MySQL
		String query = "CREATE TABLE temp "
			+ "( id int unsigned not null auto_increment primary key, "
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
        st.execute(query);
		//
		*/
        //
        /* Insert Data
        //
        // MySQL
        //String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		//String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro','pet','1234562',22);";
        String query = "INSERT INTO temp (name,login,password,age) VALUES ('Stepan','step','123456',23);";
        //
        // PostGreSQL
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (2,'Ivan','iva','qwerty',21);";
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (1,'Petro','pet','123456',22);";
        //String query = "INSERT INTO temp (id,name,login,password,age) VALUES (3,'Stepan','step','123456',23);";
        //String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro2','pet2','123456',22);";
        //
        //con.setAutoCommit(false); // begin transaction
        st.execute(query);
        //con.commit(); // end transaction
        //System.out.println("transaction rollback ...");
        //Thread.sleep(2000);
        //con.rollback();
        */
        //
        /* Update Data
        //
        //st.executeUpdate("UPDATE temp SET name='Ira' WHERE id=1;");
        st.execute("UPDATE temp SET name='Tolik' WHERE login LIKE 'st%';");
        //
        //st.execute("UPDATE users SET status=true WHERE id=1185");
        */
        //
		/* Delete Data
		//
		boolean res = st.execute("DELETE FROM temp WHERE name='Tolik';");
		//boolean res = st.execute("DELETE FROM temp WHERE name='Ira';");
		System.out.println("res = " + res);
		*/
        //
        // /* Read Data
        //
        //st.execute("USE lv696;");
        //ResultSet rs = st.executeQuery("select * from temp;");
        ResultSet rs = st.executeQuery("select * from categories;");
        //String query = "SELECT id, email, first_name, last_name, status, role_id FROM users WHERE id > 1139;";
        //ResultSet rs = st.executeQuery(query);
        //
//		ResultSet rs = null;
//		boolean res = st.execute("select * from temp;");
//		System.out.println("res = " + res);
//		if (res) {
//			rs = st.getResultSet();
//		}
        //
        int columnCount = rs.getMetaData().getColumnCount();
        // Resultset.getMetaData() get the information
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
            //System.out.print(rs.getMetaData().getColumnLabel(i) + "\t");
        }
        System.out.println();
        //
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println("before close");
        if (rs != null) {
            rs.close();
        }
        //
        //con.commit(); // Close transaction
        // */
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
        System.out.println("DONE");
    }
}
