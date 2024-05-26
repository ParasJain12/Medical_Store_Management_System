package daoimpl;

import connection.DBConnection;
import dao.ProductDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductDAOImpl implements ProductDAO{

    @Override
    public boolean addProduct(Product product) {
        boolean status = false;		
	try(Connection con = DBConnection.getConnection()){
	PreparedStatement pst = con.prepareStatement("insert into product "+ "(productname,price,quantity,description,categoryId)"+ " values(?,?,?,?,?)");
	
        pst.setString(1, product.getProductname());
	pst.setInt(2, product.getPrice());
	pst.setInt(3, product.getQuantity());
	pst.setString(4, product.getDescription());
	pst.setInt(5, product.getCategoryid());
			
        int count = pst.executeUpdate();
			
	if(count > 0) {
	    status= true;
	}
     }
      catch(SQLException e) {
	  System.out.println(e.toString());
	  return false;
        }
		
	return status;
    }

    @Override
    public boolean deleteProduct(int productId) {
        boolean status = false;
		
	try(Connection con = DBConnection.getConnection()){
	PreparedStatement pst = con.prepareStatement("delete from product where productId = ?");
		
	pst.setInt(1,productId);
			
	int count = pst.executeUpdate();		
	if(count > 0) {
	  status= true;
	}
    }
        catch(SQLException ex) {
	   System.out.println(ex.toString());
	   return false;
        }
	return status;
    }

    @Override
    public boolean updateProduct(Product product) {
        boolean status = false;
		
        try(Connection con = DBConnection.getConnection()){
	PreparedStatement pst = con.prepareStatement("update product set productname = ? , price = ?"+ " , quantity = ? , description = ? where productid = ?");
		
	pst.setString(1, product.getProductname());
	pst.setInt(2, product.getPrice());
	pst.setInt(3, product.getQuantity());
	pst.setString(4, product.getDescription());
	pst.setInt(5, product.getProductid());
			
	int count = pst.executeUpdate();		
	if(count > 0) {
	   status = true;
	}
      }
	catch(SQLException e) {
	    System.out.println(e.toString());
	    return false;
	}
	return status;
    }

    @Override
    public List<Product> getAllProducts(int start, int total) {
        List<Product> productList = new ArrayList<>();
	try(Connection con = DBConnection.getConnection()){		
	PreparedStatement pst = con.prepareStatement("select * from product"+ " limit ? , ?");
	pst.setInt(1, start-1);
	pst.setInt(2, total);
			
	ResultSet rs = pst.executeQuery();		
	if(rs.isBeforeFirst())
	{
	   while(rs.next())
	   {
	    Product product = new Product();
	    product.setProductid(rs.getInt("productid"));
	    product.setProductname(rs.getString("productname"));
	    product.setPrice(rs.getInt("price"));
	    product.setQuantity(rs.getInt("quantity"));
	    product.setDescription(rs.getString("description"));
	    product.setCategoryid(rs.getInt("categoryId"));
					
	   productList.add(product);
	  }
        }
     }
      catch(SQLException e)
      {
	System.out.println(e.toString());
	productList.clear();
	return productList;
      }
      return productList;
    }

    @Override
    public List<Product> getAllProducts() {
       List<Product> productList = new ArrayList<>();
		
       try(Connection con = DBConnection.getConnection()){
       PreparedStatement pst = con.prepareStatement("select * from product");
       ResultSet rs = pst.executeQuery();
			
	if(rs.isBeforeFirst())
        {
	  while(rs.next())
	  {
	    Product product = new Product();
	    product.setProductid(rs.getInt("productid"));
	    product.setProductname(rs.getString("productname"));
	    product.setPrice(rs.getInt("price"));
	    product.setQuantity(rs.getInt("quantity"));
	    product.setDescription(rs.getString("description"));
            product.setCategoryid(rs.getInt("categoryId"));
					
	productList.add(product);
	}
	}
    }
    catch(SQLException e)
    {
	System.out.println(e.toString());
                        
	productList.clear();
	return productList;
    }
		
    return productList; 
    }

    @Override
    public Product searchProduct(int productId) {
        Product product = null;
		
	try(Connection con = DBConnection.getConnection()){
	PreparedStatement pst = con.prepareStatement("select * from product" + " where productid = ?");
	pst.setInt(1, productId);
			
	ResultSet rs = pst.executeQuery();
		
	if(rs.isBeforeFirst())
	{
	   rs.next();
	
	   product = new Product();
	   product.setProductid(rs.getInt("productid"));
	   product.setProductname(rs.getString("productname"));
	   product.setPrice(rs.getInt("price"));
	   product.setQuantity(rs.getInt("quantity"));
	   product.setDescription(
	   rs.getString("description"));
	   product.setCategoryid(rs.getInt("categoryId"));
	}
     }
     catch(SQLException e)
     {
	System.out.println(e.toString());
	return null;
     }
		
     return product;
   }

    @Override
    public boolean updateQuantityAfterOrder(int pid, int new_quantity) {
        boolean status = false;
		
        try(Connection con = DBConnection.getConnection()){
	PreparedStatement pst =  con.prepareStatement("update product set "+ "quantity = ? where productid = ?");
	pst.setInt(1, new_quantity);
	pst.setInt(2, pid);
			
	int count = pst.executeUpdate();
		
	  if(count > 0) {
	     status = true;
          }
	}
	catch(SQLException e) {
	    System.out.println(e.toString());
	    return false;
        }
		
	return status;
    }
    
}
