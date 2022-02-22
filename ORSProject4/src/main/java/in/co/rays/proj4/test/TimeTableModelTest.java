package in.co.rays.proj4.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import in.co.rays.proj4.bean.TimeTableBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.TimeTableModel;
/**
 * TimeTableModel Test class
 *
 * @author Pushpendra Singh Kushwah
 */
public class TimeTableModelTest {
	
	static TimeTableModel model = new TimeTableModel();
	
	public static void main(String[] args) throws ParseException, ApplicationException, DuplicateRecordException {
		//testAdd();
		//testcheckbysem();
		//testlist();
		//testupdate();
		testFindbyupk();
	}

	public static void testlist() throws ApplicationException {
		// check this method
		TimeTableBean bean = new TimeTableBean();
		List list = new ArrayList();
		list = model.list(1,1);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (TimeTableBean) it.next();
			System.out.println(bean.getCourse_Id());
			System.out.println(bean.getCourse_Name());
			System.out.println(bean.getCreatedBy());
		}
	}
		
	public static void testupdate() throws ApplicationException, DuplicateRecordException {
		TimeTableBean bean = new TimeTableBean();
		bean.setId(2);
		bean.setSubject_Id(3);
		bean.setSemester("4");
		bean.setCourse_Name("Education");
		bean.setCourse_Id(2);
		bean.setSubject_Name("Arts");
		//bean.setExam_Date();
		model.update(bean);
		
		
	}
	public static void testFindbyupk() throws ApplicationException {
		TimeTableBean bean = new TimeTableBean();
		long pk = 2;
		bean = model.findByPK(2);
		System.out.println(bean.getId());
		System.out.println(bean.getCourse_Id());
		System.out.println(bean.getCourse_Name());
		System.out.println(bean.getCreatedBy());
		System.out.println(bean.getModifiedBy());
		System.out.println(bean.getCreatedDatetime());
		System.out.println(bean.getModifiedDatetime());
	}

	public static void testcheckbysem() throws ApplicationException {
		TimeTableBean bean = new TimeTableBean();
		bean = model.checkBycss(3, 2, 2);
		System.out.println(bean.getCourse_Name());
	}

	public static void testAdd() throws ParseException, ApplicationException {
		TimeTableBean bean = new TimeTableBean();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		date = sdf.parse("06/07/1996");
		
		bean.setCourse_Name("Phy.Edu.");
		bean.setCourse_Id(3);
		bean.setSubject_Name("Sports Analysis");
		bean.setSubject_Id(3);
		bean.setExam_Date(date);
		bean.setExam_Time("15:00");
		bean.setSemester("3");
		model.add(bean);
	}
}
