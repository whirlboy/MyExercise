package com.yzc.gof.TemplatePattern.DM14.JDBC模板And回调实现;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>数据库操作回调接口</p>
 */
public interface StatementCallback {

    Object doInStatement(Statement stmt) throws SQLException;

}
