package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class DaoTest {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Livros");
		
		Seller seller = new Seller(21, "Alex", "alex@gamil.com", new Date(), 5000.0, obj);
		System.out.println(seller);
		
	}

}
