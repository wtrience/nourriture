package edu.bjtu.nourriture_web.idao;

import java.util.List;

import edu.bjtu.nourriture_web.bean.Food;
import edu.bjtu.nourriture_web.bean.Recipe;

public interface IRecipeDao {

	 int 		add(Recipe recipe);
	 Recipe 	getById(int id);
	 void 		deletebyid(int id);
	 void 		update(Recipe recipe);
	 List<Recipe> search(String name);
	 List<Recipe> getPageRecipes(int categoryId,int page);
	 List<Recipe> getPageRecipes(int[] categoryIds,int page);

}
