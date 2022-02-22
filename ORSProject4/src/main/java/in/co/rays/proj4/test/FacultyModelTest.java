package in.co.rays.proj4.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.FacultyBean;
import in.co.rays.proj4.bean.StudentBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.model.FacultyModel;

public class FacultyModelTest {
	public static FacultyModel model = new FacultyModel();

	public static void main(String[] args) throws Exception {
		// testAdd();
		// testDelete();
		// testUpdate();
		// testFindByPK();
		// testFindByEmailId();
		// testsearch();
		// testlist();
		testFindByName();
	}

	public static void testFindByName() throws ApplicationException {
		FacultyBean bean = new FacultyBean();
		String str = "Satyam";
		bean = model.findByName(str);
		if (bean == null) {
			System.out.println("Test findByName failed");
		}
		System.out.println(bean.getId());
		System.out.println(bean.getFirst_Name());
		System.out.println(bean.getLast_Name());
		System.out.println(bean.getGender());
		System.out.println(bean.getDOJ());
		System.out.println(bean.getQualification());
		System.out.println(bean.getEmail_id());
		System.out.println(bean.getMobile_No());
		System.out.println(bean.getCollege_id());
		System.out.println(bean.getCollege_Name());
		System.out.println(bean.getCourse_id());
		System.out.println(bean.getCourse_Name());
		System.out.println(bean.getSubject_id());
		System.out.println(bean.getSubject_Name());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}

	public static void testlist() throws ApplicationException {
		FacultyBean bean = new FacultyBean();
		List list = new ArrayList();
		list = model.list(1, 2);
		if (list.size() < 0) { // check this condition size =0 can be considered
			System.out.println("Test list fail in Test List of FacultyModelTest");
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (FacultyBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_Name());
			System.out.println(bean.getLast_Name());
			System.out.println(bean.getGender());
			System.out.println(bean.getDOJ());
			System.out.println(bean.getQualification());
			System.out.println(bean.getEmail_id());
			System.out.println(bean.getMobile_No());
			System.out.println(bean.getCollege_id());
			System.out.println(bean.getCollege_Name());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getSubject_id());
			System.out.println(bean.getSubject_Name());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		}

	}

	public static void testsearch() {
		FacultyBean bean = new FacultyBean();
		bean.setFirst_Name("Satyam");
		List list = new ArrayList();
		try {
			list = model.Search(bean, 1, 1);
			if (list.size() == 0) {
				System.out.println("list is empty");
			}

			Iterator it = list.iterator();
			while (it.hasNext()) {
				bean = (FacultyBean) it.next();
				System.out.println(bean.getId());
				System.out.println(bean.getFirst_Name());
				System.out.println(bean.getLast_Name());
				System.out.println(bean.getGender());
				System.out.println(bean.getDOJ());
				System.out.println(bean.getQualification());
				System.out.println(bean.getEmail_id());
				System.out.println(bean.getMobile_No());
				System.out.println(bean.getCollege_id());
				System.out.println(bean.getCollege_Name());
				System.out.println(bean.getCourse_id());
				System.out.println(bean.getCourse_Name());
				System.out.println(bean.getSubject_id());
				System.out.println(bean.getSubject_Name());
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

	public static void testFindByEmailId() {
		String Emailid = "shiv@gmail.com";
		FacultyBean bean = new FacultyBean();
		try {
			bean = model.findByEmail(Emailid);
			if (bean == null) {
				System.out.println("testFindByEmailid is failed in FacultyModelTest");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_Name());
			System.out.println(bean.getLast_Name());
			System.out.println(bean.getGender());
			System.out.println(bean.getDOJ());
			System.out.println(bean.getQualification());
			System.out.println(bean.getEmail_id());
			System.out.println(bean.getMobile_No());
			System.out.println(bean.getCollege_id());
			System.out.println(bean.getCollege_Name());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getSubject_id());
			System.out.println(bean.getSubject_Name());
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
		long pk = 3;
		FacultyBean bean = new FacultyBean();
		try {
			bean = model.findByPk(pk);
			if (bean == null) {
				System.out.println("testFindByPk is failed FacultyModelTest");
			}
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_Name());
			System.out.println(bean.getLast_Name());
			System.out.println(bean.getGender());
			System.out.println(bean.getDOJ());
			System.out.println(bean.getQualification());
			System.out.println(bean.getEmail_id());
			System.out.println(bean.getMobile_No());
			System.out.println(bean.getCollege_id());
			System.out.println(bean.getCollege_Name());
			System.out.println(bean.getCourse_id());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getSubject_id());
			System.out.println(bean.getSubject_Name());
			System.out.println(bean.getCreatedBy());
			System.out.println(bean.getModifiedBy());
			System.out.println(bean.getCreatedDatetime());
			System.out.println(bean.getModifiedDatetime());

		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testUpdate() throws ParseException, ApplicationException {

		// FacultyBean bean = model.findByPk(5);
		FacultyBean bean = new FacultyBean();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-yyyy");
		bean.setId(3);
		bean.setFirst_Name("deepak");
		bean.setLast_Name("Sahu");
		bean.setGender("M");
		bean.setDOJ(sdf.parse("18-08-2020"));
		bean.setQualification("BSw");
		bean.setEmail_id("Dps@gmail.com");
		bean.setMobile_No("7879821340");
		bean.setCollege_id(2);
		bean.setCollege_Name("LNCT");
		bean.setCourse_id(4);
		bean.setCourse_Name("Bachelor of Social Work");
		bean.setSubject_id(4);
		bean.setSubject_Name("humanity");
		bean.setCreatedBy("Admin");
		bean.setModifiedBy("Admin");
		bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
		bean.setModifiedDatetime(new Timestamp(new Date().getTime()));
		model.update(bean);
		System.out.println("testUpdate of facultyModel=success");
	}

	public static void testDelete() {
		try {
			long pk = 3;
			FacultyBean bean = new FacultyBean();
			bean.setId(pk);

			model.delete(bean);
			FacultyBean deleteBean = model.findByPk(pk);
			if (deleteBean != null) {
				System.out.println("delete fail of testDelete");
			}
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void testAdd() throws Exception {
		FacultyBean bean = new FacultyBean();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			bean.setFirst_Name("Raj");
			bean.setLast_Name("Patidar");
			bean.setGender("Male");
			bean.setDOJ(sdf.parse("18-08-2019"));
			bean.setQualification("LLM");
			bean.setEmail_id("stringbuffer@gmail.com");
			bean.setMobile_No("848452650");
			bean.setCollege_id(1);
			bean.setCollege_Name("Ahilya Bai");
			bean.setCourse_id(5);
			bean.setCourse_Name("Law");
			bean.setSubject_id(4);
			bean.setSubject_Name("IPC");
			bean.setCreatedBy("Admin");
			bean.setModifiedBy("Admin");
			bean.setCreatedDatetime(new Timestamp(new Date().getTime()));
			bean.setModifiedDatetime(new Timestamp(new Date().getTime()));

			long pk = model.add(bean);

			FacultyBean addedBean = model.findByPk(pk);
			if (addedBean == null) {
				System.out.println("testAdd method = fail");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
