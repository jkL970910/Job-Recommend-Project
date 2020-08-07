package db;

public class MySQLDBUtil {
	private static final String INSTANCE = "jklproject-job.c1ccgckfotlx.us-east-2.rds.amazonaws.com";
	private static final String PORT_NUM = "3306";
	public static final String DB_NAME = "jupiter";
	private static final String USERNAME = "jkl";
	private static final String PASSWORD = "Wafxd19970910";
	public static final String URL = "jdbc:mysql://"
			+ INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
