package daoimpl;

import connection.DBConnection;
import dao.CategoryDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;

public class CategoryDAOImpl implements CategoryDAO {

    @Override
    public boolean addCategory(Category category) {
        boolean status = false;
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("insert into category(categoryName) values(?)");
            ps.setString(1,category.getCategoryName());
            
            int count = 0;
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
    public boolean deletCategory(Category category) {
       boolean status = false;
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("delete from category where categoryName = ?");
            ps.setString(1,category.getCategoryName());
            
            int count = 0;
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
    public String getCategoryNameById(int categoryId) {
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("select * from category where categoryId = ?");
            
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            if(rs.isBeforeFirst()){
               rs.next();
	       String categoryName = rs.getString("categoryName");
	       return categoryName;        
            }
            else{
                return "";
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return "";
    }

    @Override
    public List<Category> getAllCategories() {
         List <Category> al = new ArrayList<>();
         try(Connection con = DBConnection.getConnection()){
             PreparedStatement ps = con.prepareStatement("select * from category");
             ResultSet rs = ps.executeQuery();
             if(rs.isBeforeFirst()){
                 while(rs.next()){
                     Category category = new Category(); 
		     category.setCategoryName(rs.getString("categoryName"));
		     category.setCategoryId(rs.getInt("categoryId"));
		     al.add(category);
                 }
             }
         } catch (SQLException e) {
             System.out.println(e.toString());
             al.clear();
             return al;
        }
         return al;
    }

    @Override
    public boolean deleteCategory(int catid) {
       boolean status = false;
        try(Connection con = DBConnection.getConnection()){
            PreparedStatement ps = con.prepareStatement("delete from category where categoryID = ?");
            ps.setInt(1,catid);
            
            int count = 0;
            if(count > 0){
                status = true;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
        return status; 
    }
    
}
