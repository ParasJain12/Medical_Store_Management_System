package daoimpl;

import connection.DBConnection;
import dao.AdminDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Admin;

public class AdminDAOImpl implements AdminDAO {

    @Override
    public boolean register(Admin admin) {
        boolean status = false;
        try(Connection con = DBConnection.getConnection())
        {
            PreparedStatement ps = con.prepareStatement("insert into admin values(?,?)");
            ps.setString(1,admin.getUserid());
            ps.setString(2,admin.getPassword());
            
            int count = ps.executeUpdate();
            
            if(count > 0){
                status = true;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            return false;
        }
        return status;
    }

    @Override
    public boolean checkAdmin(Admin admin) {
        boolean status = false;
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("select * from admin where "+ "userid like ? and password like ?");
            ps.setString(1,admin.getUserid());
            ps.setString(2,admin.getPassword());
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
