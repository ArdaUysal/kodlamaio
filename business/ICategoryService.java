package business;

import entities.Category;

public interface ICategoryService {
    void add(Category category) throws Exception;
    void delete(Category category);
    void update(Category category);
}
