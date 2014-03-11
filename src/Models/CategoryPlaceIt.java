package Models;

import java.util.ArrayList;

public class CategoryPlaceIt extends PlaceIt{
	ArrayList<String> category;
	
	public CategoryPlaceIt(String title, String description) {
		super(title, description);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> getCategory(){
		return this.category;
	}
	
	public void setCategory(ArrayList<String> category){
		this.category = category;
	}

}
