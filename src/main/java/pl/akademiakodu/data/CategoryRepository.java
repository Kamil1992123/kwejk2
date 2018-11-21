package pl.akademiakodu.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.model.Category;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {


    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "sport"),
            new Category(3, "it")

    );

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public List<Category> getFavorites() {
        List<Category> categorieFunny = new ArrayList<>();
        List<Category> categorieSport = new ArrayList<>();
        List<Category> categorieIt = new ArrayList<>();

        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == 1)
                categorieFunny.add(category);
            else if (category.getId() == 2)
                categorieFunny.add(category);
            else if (category.getId() == 3)
                categorieFunny.add(category);


        }
        return null;

    }
}