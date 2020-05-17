package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("************* Testing findById method *************\n");
		
		Department dep = departmentDao.findById(3);
		
		System.out.println(dep);
		
		System.out.println("\n\n\n");
		
		
	
		
		System.out.println("************* Testing findAll method *************\n");

		List<Department> list = departmentDao.findAll();

		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n\n\n");
		
		
		
		
		
		System.out.println("************* Testing insert method *************\n");

		Department newDepartment = new Department(null, "Music");
		
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n\n\n");
		
		
		
		
		System.out.println("************* Testing update method *************\n");

		dep = departmentDao.findById(1);
		
		dep.setName("Foods");
				
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n\n\n");
		
		
		
		
		
		System.out.println("************* Testing delete method *************\n");

		departmentDao.deletebyId(11);
		
		System.out.println("Department deleted!");

	}

}
