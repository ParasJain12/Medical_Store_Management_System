package daoimpl;

import connection.DBConnection;
import dao.UserDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDAOImpl implements UserDAO{

    @Override
    public boolean register(User user) {
        boolean status = false;
        try(Connection con = DBConnection.getConnection()){
           PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
           pst.setString(1, user.getUserid());
	   pst.setString(2, user.getPassword());
           pst.setString(3, user.getEmailid());
	   pst.setInt(4, user.getAge());
	   pst.setString(5, user.getContact());
	   pst.setString(6, user.getCity());
	   pst.setString(7, user.getState());
	   pst.setString(8, user.getPincode());
           int count = pst.executeUpdate();
           
           if(count > 0){
               status = true;
           }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
        return status;
    }

    @Override
    public boolean checkUser(User user) {
       boolean status = false;
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("select * from admin where "+ "userid like ? and password like ?");
            ps.setString(1,user.getUserid());
            ps.setString(2,user.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.isBeforeFirst()){
                status = true;
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
            return false;
        }
        return status;
    }
    
}
