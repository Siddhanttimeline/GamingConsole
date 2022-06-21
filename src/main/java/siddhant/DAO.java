package siddhant;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.ServerVersion;

import java.lang.ClassNotFoundException;

public class DAO {
	public static boolean insertPlayerRecordToDB(nfs n) throws ClassNotFoundException, SQLException
	{
		//boolean f = false;
		
			Connection con = cp.getCon();
			String query = "insert into tb1(Player ,ID) values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,n.getPlayerName());
			ps.setInt(2,n.getPlayerID());
			ps.executeUpdate();
			boolean f = true;
			return f;
	}
	public static boolean insertPlayerRecordToDB(CSGO cs) throws ClassNotFoundException, SQLException
	{
		//boolean f = false;
		
			Connection con = cp.getCon();
			String query = "insert into tb3csgo(Player ,ID) values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,cs.getPlayerName());
			ps.setInt(2,cs.getPlayerID());
			ps.executeUpdate();
			boolean f = true;
			return f;
	}
	public static boolean insertPlayerRecordToDB(valorant va) throws ClassNotFoundException, SQLException
	{
		//boolean f = false;
		
			Connection con = cp.getCon();
			String query = "insert into tb2valo(Player ,ID) values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,va.getPlayerName());
			ps.setInt(2,va.getPlayerID());
			ps.executeUpdate();
			boolean f = true;
			return f;
	}
	public static boolean passcheck(gameenter g) throws ClassNotFoundException, SQLException
	{
		
		ResultSet rs;
		boolean checkUser = false;
		Connection con = cp.getCon();
		
		String query = "select * from tbpass where Uname = ? and Upass = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,g.getUname());
		ps.setLong(2,g.getUpass());
		rs = ps.executeQuery();
		if(rs.next()) {
			checkUser = true;
		}
		return checkUser;
	}	
	public static boolean insertCharaintoDB(characters ch) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb2valo(Characters) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,ch.getCharac());
		ps.executeUpdate();
		boolean f = true;
		return f;
	}
	public static boolean insertCharaintoDB1(characters ch) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb1(Characters) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,ch.getCharac());
		ps.executeUpdate();
		boolean f = true;
		return f;
	}
	public static boolean insertCharaintoDB2(characters ch) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb3csgo(Characters) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,ch.getCharac());
		ps.executeUpdate();
		boolean f = true;
		return f;
	}
	public static void insertgunintoDB(guns gn) throws ClassNotFoundException, SQLException { // for valo
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb2valo(Gun) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,gn.getGun());
		ps.executeUpdate();
	}
	
	public static void insertgunintoDB1(guns gn) throws ClassNotFoundException, SQLException { //for csgo
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb3csgo(Guns) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,gn.getGun());
		ps.executeUpdate();
	}
	public static void insertgunintoDB2(guns gn) throws ClassNotFoundException, SQLException { //nfs
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb1(Guns) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,gn.getGun());
		ps.executeUpdate();
	}
	public static void insertmapintoDB(map m) throws ClassNotFoundException, SQLException {   // map for nfs
		// TODO Auto-generated method stub 
		Connection con = cp.getCon();
		String query = "insert into tb1(Guns) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,m.getMaps());
		ps.executeUpdate();
	}
	public static void insertmapintoDB2(map m) throws ClassNotFoundException, SQLException {    // map for valo
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb2valo(Guns) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,m.getMaps());
		ps.executeUpdate();
	}
	public static void insertmapintoDB3(map m) throws ClassNotFoundException, SQLException {  // map for csgo
		// TODO Auto-generated method stub
		Connection con = cp.getCon();
		String query = "insert into tb3csgo(Guns) values(?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,m.getMaps());
		ps.executeUpdate();
	}
	public static void getData() throws ClassNotFoundException
	{
		try {
		ResultSet rs;
		Connection con = cp.getCon();
		Statement st = con.createStatement();
		String ss = " select * from tb1";
		rs = st.executeQuery(ss);
		while(rs.next())
		{
			System.out.println(rs.getString("Player") + "\t" + rs.getString("ID") + "\t" + rs.getString("Characters")
													+ "\t" + rs.getString("Guns") + "\t" + rs.getString("Maps"));
		}
		}catch(SQLException ex)
		{
			Logger lgr = Logger.getLogger(ServerVersion.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		}
	}
}
