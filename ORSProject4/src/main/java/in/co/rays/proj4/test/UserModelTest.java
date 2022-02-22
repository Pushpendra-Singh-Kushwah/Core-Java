package in.co.rays.proj4.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.UserModel;

public class UserModelTest {
	
	public static UserModel model = new UserModel();
	
	public static void main(String[] args) throws Exception {
		//testAdd();
        //testDelete();
         //testUpdate();
        //testFindByPK();
        //testFindByLogin();
         //testSearch();
        //testGetRoles();
        //testList();
        //testAuthenticate();
         //testRegisterUser();  // test is undone
        // testchangePassword(); // test is undone
        // testforgetPassword(); // test is undone
        //testresetPassword();   // test is undone
	}

	private static void testRegisterUser() {
		// TODO Auto-generated method stub
		
	}

	public static void testAuthenticate() {
		 try {
	            UserBean bean = new UserBean();
	            bean.setLogin("yasindore@gmail.com");
	            bean.setPassword("786");
	            bean = model.authenticate(bean.getLogin(), bean.getPassword());
	            if (bean != null) {
	                System.out.println("Successfully login");

	            } else {
	                System.out.println("Invalied login Id & password");
	            }

	        } catch (ApplicationException e) {
	            e.printStackTrace();
	        }
		
	}

	public static void testList() throws ApplicationException {
		UserBean bean = new UserBean();
		List list = new ArrayList();
		list = model.list(2, 4);
		if (list.size() < 0) {
            System.out.println("Test Serach fail");
        }
		 
		 Iterator it = list.iterator();
        while (it.hasNext()) {
            bean = (UserBean) it.next();
            System.out.println(bean.getId());
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLastName());
            System.out.println(bean.getLogin());
            System.out.println(bean.getPassword());
            System.out.println(bean.getDob());
            System.out.println(bean.getRoleId());
            System.out.println(bean.getGender());
        }
	}

	public static void testSearch() throws Exception {
		UserBean bean = new UserBean();
		//bean.setFirstName("gagan");
		bean.setId(2);
		List list = new ArrayList();
		list = model.search(bean, 1, 1);
		 if (list.size() < 0) {
             System.out.println("Test Serach fail");
         }
		 
		 Iterator it = list.iterator();
         while (it.hasNext()) {
             bean = (UserBean) it.next();
             System.out.println(bean.getId());
             System.out.println(bean.getFirstName());
             System.out.println(bean.getLastName());
             System.out.println(bean.getLogin());
             System.out.println(bean.getPassword());
             System.out.println(bean.getDob());
             System.out.println(bean.getRoleId());
             System.out.println(bean.getGender());
         }
		
	}

	public static void testFindByLogin() throws Exception {
		UserBean bean = new UserBean();
		String str = "aaa@gmail.com";
		bean = model.findByLogin(str);
		
		System.out.println(bean.getId());
        System.out.println(bean.getFirstName());
        System.out.println(bean.getLastName());
        System.out.println(bean.getLogin());
        System.out.println(bean.getPassword());
        System.out.println(bean.getDob());
        System.out.println(bean.getRoleId());
        System.out.println(bean.getConfirmPassword());
        System.out.println(bean.getGender());
        System.out.println("testFindByLogin");
	}

	public static void testFindByPK() throws Exception {
		UserBean bean = new UserBean();
		long pk = 4;
		bean = model.findByPK(pk);
		System.out.println("testFindByPk=success");
		System.out.println(bean.getId());
        System.out.println(bean.getFirstName());
        System.out.println(bean.getLastName());
        System.out.println(bean.getLogin());
        System.out.println(bean.getPassword());
        System.out.println(bean.getDob());
        System.out.println(bean.getRoleId());
        System.out.println(bean.getConfirmPassword());
        System.out.println(bean.getGender());
      
	}

	public static void testUpdate() {
	
		try {
            UserBean bean = model.findByPK(7L);
            bean.setFirstName("country");
            bean.setLastName("jaihindi");
            bean.setLogin("yasindore@gmail.com");
            bean.setPassword("786123");

            model.update(bean);

            UserBean updatedbean = model.findByPK(7L);
            // check this condition
            if (!"yasindore@gmail.com".equals(updatedbean.getLogin())) {
                System.out.println("Test Update fail");
            }
        } catch (ApplicationException e) {
            e.printStackTrace();
        } catch (DuplicateRecordException e) {
            e.printStackTrace();
        }
	}

	public static void testDelete() throws Exception {
		UserBean bean = new UserBean();
		bean.setId(6);
		model.delete(bean);
		System.out.println("delete = success");
		
	}

	
	public static void testAdd() throws ParseException {
		try {
		UserBean bean = new UserBean();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		bean.setFirstName("satyam");
        bean.setLastName("singh");
        bean.setLogin("anshu@gmail11.com");
        bean.setPassword("1234");
        bean.setDob(sdf.parse("06-07-1996"));
        bean.setRoleId(4L);
        bean.setGender("Male");
        bean.setConfirmPassword("1234");
   
			long pk = model.add(bean);
			UserBean addedBean = model.findByPK(pk);
			if (addedBean==null) {
				System.out.println("add fail in User");
			}
			
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DuplicateRecordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
