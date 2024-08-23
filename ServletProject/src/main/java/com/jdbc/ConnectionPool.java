package com.jdbc;

import java.sql.*;
import java.util.*;


public final class ConnectionPool {
// 스테텍- 공유 - 스태틱만 접근가능 
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	//사용하지 않는 커넥션 즉, 초기커넥션을 저장하는 변수 선언 
	private ArrayList<Connection> free; // 사용 x 커넥션 = free
	private ArrayList<Connection> used; //사용중인 커넥션 = used
	private final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String JDBC_USER = "scott";
	private final String JDBC_PASSWD = "tiger";
	
	//처음 컨넥션수 초기화 
	private int initialCons = 10; 
	// 최대 연결 커넥션 수
	private int maxCons = 20; 
	//총 커넥션수를 저장할 변수 
	private int numCons = 0;
	
	private static ConnectionPool cp;
	
	public static ConnectionPool getInstance() {
		
		try {
			if (cp == null) {
				synchronized (ConnectionPool.class) {
					cp = new ConnectionPool();
					
					
				}
			}
		}catch(SQLException ss) {
			ss.printStackTrace();
		}
		return cp;
		
	}
	
	private ConnectionPool() throws SQLException{
		
		/*
		 * c초기 컨넥션 개수를 각각의 ArrayList에 저장할 수 있도록 
		 * 초기 컨넥션 수 만큼 ArrayList 객체를 생성합니다. 
		 * 
		 */
		free = new ArrayList<Connection>(initialCons);
		used = new ArrayList<Connection>(initialCons);
		
		// initialCons 수만큼 Connection 객체를 생성(free)
		while(numCons < initialCons) {
			addConnection();		
			}
			
		
	}
	
	// free에 컨넥션 객체를 저장함
	private void addConnection() throws SQLException{
		free.add(getNewConnection()); 
		
	}
	
	private Connection getNewConnection() throws SQLException{
		Connection con =null;
		
		try {
			con = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWD);
		}catch(SQLException s) {
			s.printStackTrace();
		}
	System.out.println("About to connect to"+con);
	// 커넥션 생성할때 마다 숫자 생상 
	++numCons;
	return con;
	
	}
	//free 아직 연결되지 않은 커넥션을 used로 옮기는 작업 -> free ---> used
	public synchronized Connection getConnection() throws SQLException {
		//free에 컨넥션이 없으면 maxCons만큼 Connection을 더 생성함
		if(free.isEmpty()) {
			while (numCons <maxCons) {
				addConnection();
			}
		}
		
		Connection _con;
		_con = free.get(free.size()-1);
		free.remove(_con);
		used.add(_con); // 프리 없애고 사용자 증가 
		return _con;
		
	}
	
	//used에 있는 connection을 free 로 반납 
	public synchronized void releaseConnection(Connection _con) throws SQLException{
		
		boolean flag = false; 
		if(used.contains(_con)) {
			used.remove(_con);
			numCons--; // 있어서 빠졌다 
			flag =true;
		}else {
			throw new SQLException("Connectiompool에 존재하지 않습니다."); // 강제로 익셉션 발동을 시킴 
		}
		
		try {
			if (flag) {
				free.add(_con); numCons++;
				
			}else {
				_con.close();
			}
				
		}catch (SQLException e) {
		
		}try {
			_con.close();
		}catch (SQLException ss) {
			ss.printStackTrace();
		}
		
	}
	
	//모든 커넥션 자원을 반납(해제) 
	//used에 있는 커넥션을 모두 삭제해버버림
	public void closeAll() {
		//used에 있는 커넥션을 모두 삭제해버버림
		for (int i = 0; i <used.size();i++) {
			Connection _con = (Connection)used.get(i);
			used.remove(i--);
			try {
				_con.close();
			}catch (SQLException sq) {
				sq.printStackTrace();
			}
		}
		
		
		//free에 있는 커넥션을 모두 삭제해버버림
		for (int i = 0; i <free.size();i++) {
			Connection _con = (Connection)free.get(i);
			free.remove(i--);
			try {
				_con.close();
			}catch (SQLException sq) {
				sq.printStackTrace(); 
			}
		}
	}

	public int getMaxCons() {
		return maxCons;
	}

	public int getNumCons() {
		return numCons;
	}
}
