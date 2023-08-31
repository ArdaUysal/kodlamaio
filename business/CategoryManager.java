package business;

import core.logger.Logger;
import database.IProductDao;
import entities.Category;

public class CategoryManager implements ICategoryService {
    private Category[] categories;
    private IProductDao productDao;
    private Logger log;

    public CategoryManager(Category[] categories, IProductDao productDao, Logger log){
        this.categories = categories;
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add (Category category) throws Exception {
        for (Category categoryName : categories) {
            if(categoryName.getCategoryName() == category.getCategoryName()){
                throw new Exception("This category has already been added.");
            }
        }
        productDao.add(category);
        log.add(category);
    }

    @Override
    public void delete(Category category) {
        productDao.delete(category);
        
    }

    @Override
    public void update(Category category) {
        productDao.update(category);
        
    }
    
}
