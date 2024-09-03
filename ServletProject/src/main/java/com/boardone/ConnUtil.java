package com.boardone;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;
/*매소드 컨넥션 - 디비연결 컨넥션*/ 
public class ConnUtil {
//DBCP - 많은 사람이 몰릴때 - 컨넥션풀 - 여러개의 서버를 뿌려 -  
private static DataSource ds;
static {
	try {
		InitialContext ctx = new InitialContext();
		ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
		
	} catch (NamingException ne) {
		ne.printStackTrace();
	
	}
}
	
public static Connection getConnection() throws SQLException{
	return ds.getConnection();
}

}
