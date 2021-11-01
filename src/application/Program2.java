package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n--- TEST 1: insert() ---");
		Department dep = new Department();
		dep.setName("Publishing");
		departmentDao.insert(dep);
		
		System.out.println("\n--- TEST 2: update() ---");
		dep.setName("newUpdatedName");
		departmentDao.update(dep);
		
		System.out.println("\n--- TEST 3: delete() ---");
		departmentDao.deleteById(10);
		
		System.out.println("\n--- TEST 4: findById() ---");
		dep = departmentDao.findById(11);
		System.out.println(dep);
		
		System.out.println("\n--- TEST 5: findAll() ---");
		List<Department> list = departmentDao.findAll();
		for(Department department : list) {
			System.out.println(department);
		}

		
	}

}
