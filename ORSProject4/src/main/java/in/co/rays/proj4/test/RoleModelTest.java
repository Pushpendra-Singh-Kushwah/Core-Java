package in.co.rays.proj4.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.RoleModel;

public class RoleModelTest {
	public static RoleModel model = new RoleModel();
	
	public static void main(String[] args) throws Exception {
		//testAdd();
        //testDelete();
        //testUpdate();
        //testFindByPK();
        //testFindByName();
        //testSearch();
        testList();
	}

	public static void testList() throws Exception {
		RoleBean bean = new RoleBean();
		List list = new ArrayList();
		list = model.list(1, 2);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			 bean = (RoleBean) it.next();
			 System.out.println(bean.getId());
			 System.out.println(bean.getName());
		}
	}

	public static void testSearch() throws Exception {
		RoleBean bean = new RoleBean();
		List list = new ArrayList();
		bean.setName("Andhra");
		list = model.search(bean, 1, 1);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			 bean = (RoleBean) it.next();
			 System.out.println(bean.getValue());
			 System.out.println(bean.getName());
			 System.out.println(bean.getId());
		}
	}

	public static void testFindByName() throws Exception {
		RoleBean bean = model.findByName("Andhra");
		System.out.println(bean.getName());
		System.out.println(bean.getId());
		System.out.println("testFindByName");
		
	}

	public static void testFindByPK() throws Exception {
		RoleBean bean = model.findByPK(3);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println("testFindByPK success");
	}

	public static void testUpdate() throws DuplicateRecordException, DatabaseException, ApplicationException {
		RoleBean bean = model.findByPK(3);
		bean.setName("Andhra");
		bean.setDescription("Pradesh");	
		
			model.update(bean);
           System.out.println("test updated success");
		
	}

	public static void testDelete() {
		try {
			RoleBean bean = new RoleBean();
			long id = 4;
			bean.setId(id);
		
			model.delete(bean);
			
			RoleBean deletedbean = model.findByPK(id);
            if (deletedbean != null) {
                System.out.println("Test Delete fail");
            }
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public static void testAdd() {
		RoleBean bean = new RoleBean();
		bean.setName("Arshdeep");
		bean.setDescription("Raj");
		
		try {
			long pk = model.add(bean);
			
			RoleBean addedbean = model.findByPK(pk);
            if (addedbean == null) {
                System.out.println("Test add failed");
            }
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
