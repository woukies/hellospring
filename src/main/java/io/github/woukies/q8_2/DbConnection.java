package io.github.woukies.q8_2;

public class DbConnection {
	private String mssqlId, mssqlPw;
	private String mysqlId, mysqlPw;

	public String getMssqlId() {
		return mssqlId;
	}

	public void setMssqlId(String mssqlId) {
		this.mssqlId = mssqlId;
	}

	public String getMssqlPw() {
		return mssqlPw;
	}

	public void setMssqlPw(String mssqlPw) {
		this.mssqlPw = mssqlPw;
	}

	public String getMysqlId() {
		return mysqlId;
	}

	public void setMysqlId(String mysqlId) {
		this.mysqlId = mysqlId;
	}

	public String getMysqlPw() {
		return mysqlPw;
	}

	public void setMysqlPw(String mysqlPw) {
		this.mysqlPw = mysqlPw;
	}
}
