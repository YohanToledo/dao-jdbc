package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		

		Department department = new Department(1, "Production");
		Seller seller = new Seller(1, "yohan", "yohan@gmail.com", new Date() , 1500.00, department); 
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}
