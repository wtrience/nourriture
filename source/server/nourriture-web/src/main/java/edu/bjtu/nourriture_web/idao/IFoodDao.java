package edu.bjtu.nourriture_web.idao;

import java.util.List;

import edu.bjtu.nourriture_web.bean.Food;


public interface IFoodDao {
	/** add one row **/
	int add(Food food);
	/** check if category is already exist **/
	boolean isCategoryExist(int categoryId);
	/** check if flavour is already exist **/
	boolean isFlavourExist(int flavourId);
	/** check if manufacturer is already exist **/
	boolean isManufacturerExist(int manufacturerId);
	/**get food by id**/
	Food getById(int id);
	/** search the food by manufacturerId **/
	List getByManufacturerId(int manufacturerId);
	/** delete the food by id **/
	void deletebyid(int id);
	/** update the food **/
	void update(Food food);
	/** search by sift **/
	List<Food> getBySift(double fromPrice,double toPrice,int categoryId,int flavourId,int produceRegionId,int buyRegionId);
	/** initial the List **/
	//List<Food> initialList();
}
