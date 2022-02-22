package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.StudentModel;

public class StudentModelTest {
	
	public static StudentModel model= new StudentModel();
	
	public static void main(String[] args) throws ParseException, DuplicateRecordException, DatabaseException, ApplicationException {
		//testAdd();
		//testDelete();
        //testUpdate();   // how it works, doubt in working
        //testFindByPK();
        //testFindByEmailId();
         //testSearch();
        testList();
	}

	public static void testList() {
		try {
			StudentBean bean = new StudentBean();
			List list= new ArrayList();
			list = model.list();
			if (list.size()<0) {              // how it goes less than 0;
				System.out.println("testList failed in Student");
			}
				Iterator it = list.iterator();
				while (it.hasNext()) {
					bean = (StudentBean) it.next();
	                System.out.println(bean.getId());
	                System.out.println(bean.getFirstName());
	                System.out.println(bean.getLastName());
	                System.out.println(bean.getDob());
	                System.out.println(bean.getMobileNo());
	                System.out.println(bean.getEmail());
	                System.out.println(bean.getCollegeId());
				}
			
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testSearch() {
		try {
			StudentBean bean = new StudentBean();
			List list = new ArrayList();
			bean.setFirstName("Anshu");
			list = model.search(bean, 1, 1);
			if (list.size() < 0) {
                System.out.println("Test Serach fail, list is empty");
            }
			Iterator it = list.iterator();
            while (it.hasNext()) {
                bean = (StudentBean) it.next();
                System.out.println(bean.getId());
                System.out.println(bean.getFirstName());
                System.out.println(bean.getLastName());
                System.out.println(bean.getDob());
                System.out.println(bean.getMobileNo());
                System.out.println(bean.getEmail());
                System.out.println(bean.getCollegeId());
            }
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testFindByEmailId() {
		try {
		StudentBean bean = new StudentBean();
		String str = "satyam@gmail.com";
		
			bean=model.findByEmailId(str);
			 if (bean == null) {
	                System.out.println("Test Find By EmailId fail");
	            }
	            System.out.println(bean.getId());
	            System.out.println(bean.getFirstName());
	            System.out.println(bean.getLastName());
	            System.out.println(bean.getDob());
	            System.out.println(bean.getMobileNo());
	            System.out.println(bean.getEmail());
	            System.out.println(bean.getCollegeId());
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testFindByPK() {
		try { 
		StudentBean bean = new StudentBean();
         long pk = 2;
			bean = model.findByPK(pk);
			if (bean == null) {
                System.out.println("Test Find By PK fail");
            }
            System.out.println(bean.getId());
            System.out.println(bean.getFirstName());
            System.out.println(bean.getLastName());
            System.out.println(bean.getDob());
            System.out.println(bean.getMobileNo());
            System.out.println(bean.getEmail());
            System.out.println(bean.getCollegeId());
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testUpdate() throws DatabaseException, ApplicationException {

	}
	public static void testDelete() {
		StudentBean bean = new StudentBean();
		long pk = 1;
		bean.setId(pk);
		try {
			model.delete(bean);
//			StudentBean deletedbean = model.findByPK(pk);
//	        if (deletedbean != null) {
//	            System.out.println("Test Delete fail");
//	        }
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void testAdd() throws ParseException {
		try {
		StudentBean bean = new StudentBean();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		bean.setFirstName("jai");
        bean.setLastName("veeru");
        bean.setDob(sdf.parse("18/06/1980"));
        bean.setMobileNo("9826254842");
        bean.setEmail("jaiveeru@gmail.com");
        bean.setCollegeId(101);
        bean.setCollegeName("jail");
        bean.setCreatedBy("Admin");
        bean.setModifiedBy("Admin");
        bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
        bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		
			long pk = model.add(bean);
			
//			StudentBean addedbean = model.findByPK(pk);
//            if (addedbean == null) {
//                System.out.println("Test add fail");
//            }
			
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
}
