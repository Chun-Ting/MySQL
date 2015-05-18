package test;
/*author CT*/
import java.sql.*;

public class mysql_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="555";
		String nu = "8";
		Connection conn = null;
		/*		連結MySql	*/
		try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		/*註記  ↓下方是用java程式建立資料表的程式
		 *jdbc:mysql://localhost:3306  為自身電腦裝MYSQL的port
		 *3306/test 的test則是資料庫的名稱
		 **/
		/*conne內的格式 :DriverManager.getConnection("jdbc:mysql://localhost:3306(本地端的port)
		 * /public_broker"(資料庫名), "root"(帳號),"123456"(密碼))  */
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/public_broker", "root","123456");
		System.out.println("connected to the database");
		Statement stmt = conn.createStatement();
		System.out.println("Inserting records");
		/*		連結MySql END	*/
		
		
		
		/*Sells是資料表的名稱,bar VARCHAR(40), beer VARCHAR(40), 
		 * price INT則是資料表的欄位名子跟型態*/
//		創資料表一次即可
		
		/*		創資料表		*/
//		stmt.executeUpdate("CREATE TABLE Sells " +
//		"(bar VARCHAR(40), beer VARCHAR(40), price INT)");
		/*		創資料表 END		*/
		
		/*		MySql Insert	*/
		String qry1 = "INSERT INTO workflow_test VALUES(2,'"+s+"',123,444,777,888,777,567,777,423,110,12,11)";
		stmt.executeUpdate(qry1);
		System.out.println("資料已加入");
		/*		MySql Insert END	*/
		
		/*		Mysql delete	*/
//		String delete = "delete from workflow_test "+" where id= '"+nu+"'; ";
//		stmt.executeUpdate(delete);
//		System.out.println("資料刪除");
		/*		Mysql delete END	*/
		
		/*		查詢整個資料表		*/
		String qry2 = "SELECT * FROM workflow_test";
		/*		查詢整個資料表 END	*/
		
		/*		查詢資料表的特定欄位		*/
		String qry4 = "SELECT * FROM workflow_test WHERE id = "+nu;
		/*		查詢資料表的特定欄位 END	*/
		
		ResultSet rs = stmt.executeQuery(qry2);
		ResultSetMetaData rm = rs.getMetaData();

		int cnum = rm.getColumnCount();

		while(rs.next())
		{
		for(int i=1; i<=cnum; i++)
		{
		System.out.print(rm.getColumnName(i)+":"+rs.getObject(i)+" ");
		}
		System.out.println("");
		}
		rs.close();
		stmt.close();
		conn.close();
		System.out.println("Disconnected from database");

		} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		}

}
