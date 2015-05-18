package test;
/*author CT*/
import java.sql.*;

public class Install_mysql_90000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Install Mysql Data Base for experiment 
		//file_name : 38 ,cpu : 33 ,memory : 32,storage : 
		String[] file_name={
				"PQLGVUHK","NDZGGUQQ","ZLLOGLVO","AEHLAQJY","BLTCNCKB","QWSCFAHU","KANDYMQJ","DYBLIVJI","MTPILCPS","LIVTLPEF"
				,"STLXYDHO","OQKCLSMD","CAKEQRPP","EKHVHRRE","CZZNCIFQ","LLCODZSL","VWXBKIKC","QXIALDAI","IQPOFITU","ATLHXSWD"
				,"MVJVHCRE","MFTPQHNA","XLMOBQYD","EYLPAEEL","KKATCKAX","EZZNTYXT","IXDFZIEX","XIUVFVJA","FUSDVCNV","YLSTZNRZ"
				,"JTGUELEE","GXMEJQHI","LZILDOUG","MKFHQTOW","VFYGBIKS","CWDWXGQA","DBRNBMHE","BHTGOONS","RCEWJHJK","GWARXLDD"
				,"GJLABHXQ"};
		
		String[] cpu = {
				"11400","21700","11500","12100","12700","22500","11200","12800","21400","21300"
				,"11600","12100","12000","12600","21300","21500","22200","22300","11800","2500"
				,"21700","2200","11400","1800","2400","48000","17000","24000","36000","7000"
				,"3000","21600","16400","23600","19000","15400","23000","16400","17000","15000"
				,"47000","28000","49000","52000","33000","170000","3400","21400","13000","21000"};
		
		String[] memory = {
				"3000","2000","45000","23000","10000","1000","8000","32000","15000","6000"
				,"14000","6000","9000","33000","31000","5000","19000","47000","28000","49000"
				,"52000","33000","170000","3400","21400","13000","21000","17000","23000","8900"
				,"6500","88000","21700","2200","11400","1800","2400","48000","17000","24000","36000"
				,"21600","16400","23600","19000","15400","23000","16400","17000","33000","17000"
				,"22300"};
		
		String[] storage = {
				"45000","23000","10000","1000","8000","32000","15000","6000","14000","6000"
				,"9000","33000","21400","13000","21000","17000","23000","8900","6500","88000"
				,"47000","28000","49000","52000","33000","3000","2000","31000","5000","19000"
				,"14000","6000","9000","33000","31000","1800","2400","48000","17000","24000"
				,"15600"};
		
		String[] cpu_useage = {
				"11100","21100","1400","22300","11800","2500","21700","2200","11400","1800"
				,"2400","1900","22400","11600","21300","1700","2600","12700","25400","21900"
				,"2100","3500","21000","26100","4600","22700","14000","21800","19100","23600"
				,"8100","21000","17000","23000","24000","36000","23000","14000","13000","18000"
				,"16000","17300","3400","21400","13000","21000","17000","23000","8900","24100"
				,"16400"};
		
		String[] memory_useage = {
				"34000","32000","22000","32000","19000","16000","18000","2000","24000","21000"
				,"12000","54000","56000","15000","29000","23000","48000","46000","27000","24000"
				,"21000","17000","23000","24000","36000","23000","14000","13000","18000","16000"
				,"28000","11100","21100","1400","22300","11800","2500","21700","2200","11400"
				,"24100"};
		
		String[] storage_useage = {
				"14000","39000","12000","42000","15000","26000","8000","22000","29000","1000"
				,"2000","50000","57000","5000","9000","29000","58000","48000","17000","24000"
				,"36000","7000","3000","34000","38000","13000","16000","28000","11000","18000"
				,"6000","56000","15000","29000","23000","48000","23000","10000","1000","8000"
				,"8500"};
		
		String[] ip = {
				"163.18.49.15","163.18.49.16","163.18.49.17","163.18.49.20","163.18.49.21"
				,"163.18.49.25","163.18.49.26","163.18.49.27","163.18.49.32","163.18.49.31"};
		
		String[] port = {
				"1009","1097","1111","1216","1249","1070","1019","1005","1239","1151"
				,"1061","1144","1151","1139","1179","1170","1069","1118","1185","1232"
				,"1074","1238","1001","1217","1093","1213","1059","258","697","1120"
				,"1350","1005","1204","1302","1180","1220","1046","1472","1602","1023"
				,"2012,1932","1947","1368","1459","1603","1740","1850","1347","1608"
				,"2360"};
		
		String url = "http://163.18.49.17:50003/hello.mp4";
//		String[] url = {
//				"http://163.18.49.17:50003/hello.mp4","http://163.18.49.17:50003/hello.mp4","http://163.18.49.17:50003/hello.mp4"
//				 ,"http://163.18.49.17:50003/hello.mp4","http://163.18.49.17:50003/hello.mp4","http://163.18.49.17:50003/hello.mp4"};
		
		String[] ttl= {
				"111","21","34","59","210","144","218","188","72","236"
				,"202","148","52","63","74","49","50","69","188","97",
				"232","180","203","62","82","59","43","60","127","197"
				,"262","168","22","53","24","19","30","99","128","98"
				,"130"};
		//Mysql Install end
		
//		String s="555";  //���ռg�J���
//		String nu = "8"; //���ռg�J���
//		int j = 1;   //���ռg�J���
//		
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
//		String qry1 = "INSERT INTO test6 VALUES('"+j+"','"+s+"',123,444,777,888,777,567,777,423,110,12,11)";
		// "INSERT INTO workflow_test������(��ƪ�W) VALUES('"+j+"','"+s+"',123,444,777,888,777,567,777,423,110,12,11)"���������;
		
		for (int i = 1;i<100001 ; i++){
			int j = 0;
			j = (int) ((Math.random()*(40)+1));
			
			int k =0;
			k = (int) ((Math.random()*(10)));
			
//			System.out.println(j);
			System.out.println(k);
			String qry1 = "INSERT INTO test6 VALUES('"+i+"','"+i+"','"+file_name[j]+"','"+cpu[j]+"','"+memory[j]+"','"+storage[j]+"','"+cpu_useage[j]+"','"+memory_useage[j]+"',"
					+ "'"+storage_useage[j]+"','"+ip[k]+"','"+port[j]+"','"+url+"','"+ttl[j]+"')";
			stmt.executeUpdate(qry1);
			System.out.println("��Ƥw�[�J");
			System.out.println("�ثe counter : " + i);
		}
////		stmt.executeUpdate(qry1);
		System.out.println("��Ƥw�[�J����!!!");
//		
		/*		MySql Insert END	*/
		
		/*		Mysql delete	*/
		/*�h���R�� Start*/
//		for (int i = 0;i<1; i++){
//			String delete = "delete from test6 "+" where id= '"+i+"'; ";
//			stmt.executeUpdate(delete);
//			System.out.println("��ƧR��");
//		}
		/*�h���R�� End*/
//		String delete = "delete from test6 "+" where id= '"+j+"'; ";
//		stmt.executeUpdate(delete);
//		System.out.println("��ƧR��");
		/*		Mysql delete END	*/
		
		/*		�d�߾�Ӹ�ƪ�		*/
		String qry2 = "SELECT * FROM workflow_test";
//		ResultSet rs = stmt.executeQuery(qry2);
		/*		�d�߾�Ӹ�ƪ� END	*/
		
		/*		�d�߸�ƪ��S�w���		*/
//		String qry4 = "SELECT * FROM workflow_test WHERE id = "+nu;
//		ResultSet rs = stmt.executeQuery(qry4);
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
