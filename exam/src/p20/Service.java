package p20;

import java.sql.SQLException;
import java.util.LinkedHashMap;

public class Service {
	DBCon dbcon;

	Service() {
		dbcon = new DBCon();
	}

	public int insetClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		String sql = "insert into class_info (ciname,cidesc)\r\n" + "values(?,?)\r\n";
		try {
			result = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return result;

	}

	public int deleteClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		String sql = "delete from class_info \r\n " + "where cino=?\r\n";
		try {
			result = dbcon.executeUpdate(sql, hm);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return result;
	}

	public int updateClassInfo(LinkedHashMap<String, Object> hm) {
		int result = 0;
		String sql = "update class_info \r\n" + "set cidesc =?\r\n" + "where cino=?";
		try {
			result = dbcon.executeUpdate(sql);
			dbcon.commit();
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
