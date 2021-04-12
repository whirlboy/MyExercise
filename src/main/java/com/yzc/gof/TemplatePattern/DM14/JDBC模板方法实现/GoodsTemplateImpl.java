package com.yzc.gof.TemplatePattern.DM14.JDBC模板方法实现;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <p>商品数据库操作（模板）实现类</p>
 */
public class GoodsTemplateImpl extends AbstractJdbcTemplate {

    @Override
    protected Object doInStatement(ResultSet rs) throws SQLException {

        // 遍历数据集
//        while (rs.next()){
//           // dosomething
//        }

        System.out.println("数据集处理成功，返回Goods数据实体对象");
        return null;
    }

}
