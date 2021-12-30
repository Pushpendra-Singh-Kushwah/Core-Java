package com.raystech.marksheet;

public class TestMarksheetModel {

	public static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		//bean.setId(6);
		bean.setRollNo("Rays10");
		bean.setfName("Anshu");
		bean.setLname("Bhadoriya");
		bean.setChemistry(75);
		bean.setPhysics(76);
		bean.setMaths(77);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);
	}

	public static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		
		bean.setLname("Sen");
		bean.setId(6);

		MarksheetModel model = new MarksheetModel();
		model.update(bean);
	}

	public static void testDelete() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(6);

		MarksheetModel model = new MarksheetModel();
		model.delete(bean);
	}
	public static void testGet() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		bean.setRollNo("Rays04");

		MarksheetModel model = new MarksheetModel();
		model.get(bean);
	}
	public static void testSearch() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();
		model.search(bean);
	}
	
	public static void testGetMeritList() throws Exception {
		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();
		model.getMeritList(bean);
	}

	public static void main(String[] args) throws Exception {

		testAdd();
		//testUpdate();
		//testDelete();
		//testGet();
		//testSearch();
		//testGetMeritList();
	}

	
}
