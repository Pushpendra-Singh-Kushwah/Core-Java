package in.co.rays.proj4.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.security.auth.Subject;

import in.co.rays.proj4.bean.CourseBean;
import in.co.rays.proj4.bean.SubjectBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DatabaseException;
import in.co.rays.proj4.util.JDBCDataSource;

public class SubjectModel {

	public Integer nextPk() throws ApplicationException {
		int pk = 0;
		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select max(id) from st_subject");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("nextPk is not created");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		System.out.println("pk is created");
		return pk + 1;
	}

	public int add(SubjectBean bean) throws ApplicationException, DatabaseException {
		Connection conn = null;

		// get Course Name
		CourseModel cModel = new CourseModel();
		CourseBean CourseBean = cModel.findByPk(bean.getCourse_Id());
		bean.setCourse_Name(CourseBean.getCourse_Name());

		int pk = 0;

		try {
			conn = JDBCDataSource.getConnection();
			pk = nextPk();
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement("INSERT INTO ST_SUBJECT VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, pk);
			ps.setString(2, bean.getSubject_Name());
			// ps.setInt(3, bean.getSubject_Id());
			ps.setString(3, bean.getCourse_Name());
			ps.setInt(4, bean.getCourse_Id());
			ps.setString(5, bean.getDiscription());
			ps.setString(6, bean.getCreatedBy());
			ps.setString(7, bean.getModifiedBy());
			ps.setTimestamp(8, bean.getCreatedDatetime());
			ps.setTimestamp(9, bean.getModifiedDatetime());
			ps.executeUpdate();
			conn.commit();
			ps.close();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				throw new ApplicationException("rollback is not work in SubjectModel");
			}
			e.printStackTrace();
			throw new ApplicationException("add method in not work in SubjectModel");
		}
		finally {
			JDBCDataSource.closeConnection(conn);
		}
		System.out.println("add =success");
		return pk;
	}

	public void delete(SubjectBean bean) throws ApplicationException {
		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement("delete from st_subject where id = ?");
			ps.setLong(1, bean.getId());
			ps.executeUpdate();
			conn.commit();
			ps.close();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				throw new ApplicationException("rollback is not working in SubjectMethod");
			}
			e.printStackTrace();
			throw new ApplicationException("delete=fail in SubjectMethod");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
	}

	public void update(SubjectBean bean) throws ApplicationException {
		Connection conn = null;

		try {
			conn = JDBCDataSource.getConnection();
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(
					"UPDATE ST_SUBJECT SET Subject_Name=?,Course_NAME=?,Course_ID=?,Discription=?,CREATED_BY=?,MODIFIED_BY=?,CREATED_DATETIME=?,MODIFIED_DATETIME=? WHERE ID=?");
			ps.setString(1, bean.getSubject_Name());
			ps.setString(2, bean.getCourse_Name());
			ps.setInt(3, bean.getCourse_Id());
			ps.setString(4, bean.getDiscription());
			ps.setString(5, bean.getCreatedBy());
			ps.setString(6, bean.getModifiedBy());
			ps.setTimestamp(7, bean.getCreatedDatetime());
			ps.setTimestamp(8, bean.getModifiedDatetime());
			ps.setLong(9, bean.getId());
			ps.executeUpdate();
			conn.commit();
			ps.close();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (Exception e2) {
				throw new ApplicationException("rollback isnt work on SubjectModel");
			}
			e.printStackTrace();
			throw new ApplicationException("update method=fail in SubjectModel");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
	}

	public SubjectBean findByName(String name) throws ApplicationException {
		Connection conn = null;
		SubjectBean bean = null;
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ST_SUBJECT WHERE SUBJECT_NAME=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(rs.getInt(1));
				bean.setSubject_Name(rs.getString(2));
				bean.setCourse_Name(rs.getString(3));
				bean.setCourse_Id(rs.getInt(4));
				bean.setDiscription(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("findByName method=fail in subjectModel");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		System.out.println("findByName method = success");
		return bean;
	}

	public SubjectBean findByPk(long pk) throws ApplicationException {
		StringBuffer sql = new StringBuffer("select * from st_subject where id = ?");
		Connection conn = null;
		SubjectBean bean = null;

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ps.setLong(1, pk);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(rs.getInt(1));
				bean.setSubject_Name(rs.getString(2));
				bean.setCourse_Name(rs.getString(3));
				bean.setCourse_Id(rs.getInt(4));
				bean.setDiscription(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("findByPk=failed in SubjectModel");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return bean;
	}

	public List search(SubjectBean bean) throws ApplicationException {
		return search(bean, 0, 0);
	}

	public List search(SubjectBean bean, int pageNo, int pageSize) throws ApplicationException {
		StringBuffer sql = new StringBuffer("select * from st_subject where 1=1");

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" AND id = " + bean.getId());
			}
			if (bean.getCourse_Id() > 0) {
				sql.append(" AND Course_ID = " + bean.getCourse_Id());
			}

			if (bean.getSubject_Name() != null && bean.getSubject_Name().length() > 0) {
				sql.append(" AND Subject_Name like '" + bean.getSubject_Name() + "%'");
			}
			if (bean.getCourse_Name() != null && bean.getCourse_Name().length() > 0) {
				sql.append(" AND Course_Name like '" + bean.getCourse_Name() + "%'");
			}
			if (bean.getDiscription() != null && bean.getDiscription().length() > 0) {
				sql.append(" AND description like '" + bean.getDiscription() + " % ");
			}
		}

		// Page Size is greater then Zero then apply pagination
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + " , " + pageSize);
		}
		System.out.println("sql query is : " + sql);

		Connection conn = null;
		List list = new ArrayList();

		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				bean = new SubjectBean();
				bean.setId(rs.getInt(1));
				bean.setSubject_Name(rs.getString(2));
				bean.setCourse_Name(rs.getString(3));
				bean.setCourse_Id(rs.getInt(4));
				bean.setDiscription(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
				list.add(bean);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("search method = failed,  of subject model");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return list;
	}

	public List list() throws ApplicationException {
		return list(0, 0);
	}

	public List list(int pageNo, int pageSize) throws ApplicationException {
		StringBuffer sql = new StringBuffer("SELECT * FROM ST_SUBJECT ");

		// Page Size is greater then Zero then apply pagination
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			sql.append(" limit " + pageNo + " , " + pageSize);
		}

		Connection conn = null;
		List list = new ArrayList();
		try {
			conn = JDBCDataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				SubjectBean bean = new SubjectBean();
				bean.setId(rs.getInt(1));
				bean.setSubject_Name(rs.getString(2));
				bean.setCourse_Name(rs.getString(3));
				bean.setCourse_Id(rs.getInt(4));
				bean.setDiscription(rs.getString(5));
				bean.setCreatedBy(rs.getString(6));
				bean.setModifiedBy(rs.getString(7));
				bean.setCreatedDatetime(rs.getTimestamp(8));
				bean.setModifiedDatetime(rs.getTimestamp(9));
				list.add(bean);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("Exception in listmethod of SubjectModel");
		} finally {
			JDBCDataSource.closeConnection(conn);
		}
		return list;
	}
}
