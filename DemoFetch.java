import java.sql.*;
class DemoFetch
{
	public static void main(String args[])
	{
		connection con=null;
		Statment stmt=null;
		Resultset rs=null;
		String qry;
		
		try()
		{
			class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:mydsn");
			stmt=con.creatStatment();
			qry="select from stud";
			rs=stmt.execute Query(qry);
			
			System.out.println(RollNo \t Name \t Percentage");
                	while (rs.next())
                	{
				int rno=rs.getInt("rollno")
				string nm=rs.getString("Sname")
				flout P=rs.getFlout("per")
				System.out.println(rnot+"\t"+nm+"\t"+p);
			}
		con.close();
		}
		catch(Exception e)
		{
			system.out.println(e.getMessage());
		}
	}
}