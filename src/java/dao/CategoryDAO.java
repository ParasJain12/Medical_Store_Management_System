package dao;

import java.util.List;
import model.Category;

public interface CategoryDAO {
    boolean addCategory(Category category);
    boolean deletCategory(Category category);
    String getCategoryNameById(int categoryId);
    List <Category> getAllCategories();
    boolean deleteCategory(int catid);
}
    