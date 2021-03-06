package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("************* Testing findById method *************\n");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n\n\n");

		
		
		
		
		System.out.println("************* Testing findByDepartment method *************\n");

		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);

		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n\n\n");
		
		
		
		
		System.out.println("************* Testing findAll method *************\n");

		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n\n");
		
		
		
		
		System.out.println("************* Testing insert method *************\n");

		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n\n\n");
		
		
		
		
		System.out.println("************* Testing update method *************\n");

		seller = sellerDao.findById(1);
		
		seller.setName("Martha Waine");
				
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n\n\n");
		
		
		
		
		System.out.println("************* Testing delete method *************\n");

		sellerDao.deletebyId(13);
		
		System.out.println("Seller deleted!");
	}

}
