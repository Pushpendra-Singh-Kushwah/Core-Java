package in.co.rays.proj4.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.sql.Timestamp;

import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.bean.SubjectBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.model.SubjectModel;

public class SubjectModelTest {

	public static SubjectModel model = new SubjectModel();

	public static void main(String[] args) {
		// testAdd();
		// testDelete();
		// testUpdate();
		// testFindByPK();
		// testFindByName();
		// testSearch();
		testList();
	}

	public static void testList() {
		SubjectBean bean = new SubjectBean();
		List list = new ArrayList();
		try {
			list = model.list(1, 2);
			if (list.size() <= 0) {
				System.out.println("testList method is failed");
			}
			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (SubjectBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getSubject_Name());
				System.out.println(bean.getCourse_Name());
				System.out.println(bean.getCourse_Id());
				System.out.println(bean.getDiscription());
				System.out.println(bean.getCreatedBy());
				System.out.println(bean.getModifiedBy());
				System.out.println(bean.getCreatedDatetime());
				System.out.println(bean.getModifiedDatetime());
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testSearch() {
		SubjectBean bean = new SubjectBean();
		List list = new ArrayList();
		bean.setCourse_Name("B");
		try {
			list = model.search(bean, 1, 1);
			if (list.size() <= 0) {
				System.out.println("testSearch is failed");
			}

			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (SubjectBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getSubject_Name());
				System.out.println(bean.getCourse_Name());
				System.out.println(bean.getCourse_Id());
				System.out.println(bean.getDiscription());
				System.out.println(bean.getCreatedBy());
				System.out.println(bean.getModifiedBy());
				System.out.println(bean.getCreatedDatetime());
				System.out.println(bean.getModifiedDatetime());
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testFindByName() {
		String name = "DBMS";
		SubjectBean bean = new SubjectBean();
		try {
			bean = model.findByName(name);
			if (bean == null) {
				System.out.println("testFindByName=fail");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getSubject_Name());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getCourse_Id());
			System.out.println(bean.getDiscription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testFindByPK() {
		long pk = 2;
		SubjectBean bean = new SubjectBean();
		try {
			bean = model.findByPk(pk);
			if (bean == null) {
				System.out.println("testfindByPk=failed");
			}

			System.out.println(bean.getSubject_Name());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getCourse_Id());
			System.out.println(bean.getDiscription());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testUpdate() {
		long pk = 2;
		try {
			SubjectBean bean = model.findByPk(pk);
			bean.setSubject_Name("DBMS");
			bean.setCourse_Name("BCA");
			bean.setCourse_Id(1);
			bean.setDiscription("Bachelor of Comp. App.");
			bean.setCreatedBy("Admin");
			bean.setModifiedBy("Admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			model.update(bean);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testDelete() {
		SubjectBean bean = new SubjectBean();
		long pk = 1;
		bean.setId(pk);

		try {
			model.delete(bean);

			SubjectBean delBean = model.findByPk(pk);
			if (delBean != null) {
				System.out.println("testDelete=fail");
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testAdd() {

		SubjectBean bean = new SubjectBean();
		bean.setSubject_Name("Management");
		bean.setCourse_Name("MBA");
		bean.setCourse_Id(4);
		bean.setDiscription("Account");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

		long pk;
		try {
			pk = model.add(bean);
			SubjectBean addbean = model.findByPk(pk);
			if (addbean == null) {
				System.out.println("testAdd=fail");
			} else {
				System.out.println("testAdd=sucess");
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testAdd = suceess");
	}
}
