package p2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	public static Connection co=null;  //lazy loading
	public static Connection getConnection() throws Exception
	{
		if(co==null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			co=DriverManager.getConnection("jdbc:mysql://localhost:3306/mphasisla", "root", "root@39");
		}
		return co;
	}
}
