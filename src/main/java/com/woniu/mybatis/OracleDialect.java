package com.woniu.mybatis;

public class OracleDialect implements Dialect{

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		// TODO Auto-generated method stub
		String pageSql = "select * from " + 
				"		(select rownum rn,a.* from ("+sql+") a <"+(offset+limit)+") b" + 
				"		where b.rn>"+offset;
		return pageSql;
	}

}
