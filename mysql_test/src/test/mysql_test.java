package test;
/*author CT*/
import java.sql.*;

public class mysql_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="555";
		String nu = "8";
		Connection conn = null;
		/*		�s��MySql	*/
		try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		
		/*���O  ���U��O��java�{���إ߸�ƪ��{��
		 *jdbc:mysql://localhost:3306  ���ۨ��q����MYSQL��port
		 *3306/test ��test�h�O��Ʈw���W��
		 **/
		/*conne�����榡 :DriverManager.getConnection("jdbc:mysql://localhost:3306(���a�ݪ�port)
		 * /public_broker"(��Ʈw�W), "root"(�b��),"123456"(�K�X))  */
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/public_broker", "root","123456");
		System.out.println("connected to the database");
		Statement stmt = conn.createStatement();
		System.out.println("Inserting records");
		/*		�s��MySql END	*/
		
		
		
		/*Sells�O��ƪ��W��,bar VARCHAR(40), beer VARCHAR(40), 
		 * price INT�h�O��ƪ����W�l�򫬺A*/
//		�и�ƪ�@���Y�i
		
		/*		�и�ƪ�		*/
//		stmt.executeUpdate("CREATE TABLE Sells " +
//		"(bar VARCHAR(40), beer VARCHAR(40), price INT)");
		/*		�и�ƪ� END		*/
		
		/*		MySql Insert	*/
		String qry1 = "INSERT INTO workflow_test VALUES(2,'"+s+"',123,444,777,888,777,567,777,423,110,12,11)";
		stmt.executeUpdate(qry1);
		System.out.println("��Ƥw�[�J");
		/*		MySql Insert END	*/
		
		/*		Mysql delete	*/
//		String delete = "delete from workflow_test "+" where id= '"+nu+"'; ";
//		stmt.executeUpdate(delete);
//		System.out.println("��ƧR��");
		/*		Mysql delete END	*/
		
		/*		�d�߾�Ӹ�ƪ�		*/
		String qry2 = "SELECT * FROM workflow_test";
		/*		�d�߾�Ӹ�ƪ� END	*/
		
		/*		�d�߸�ƪ��S�w���		*/
		String qry4 = "SELECT * FROM workflow_test WHERE id = "+nu;
		/*		�d�߸�ƪ��S�w��� END	*/
		
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
