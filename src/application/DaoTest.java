package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class DaoTest {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1 - SELLER BY ID ===");

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

		System.out.println("\n=== TESTE 2 - SELLER BY DEPARTMENT ID ===");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TESTE 3 - SELLER BY DEPARTMENT FINDALL ===");

		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
