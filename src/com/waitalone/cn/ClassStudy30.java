package com.waitalone.cn;

/**
 * @Author: 独自等待
 * @Version 1.0
 * @Time: 2019-10-26 10:57
 * @Blog: https://www.waitalone.cn
 */
public class ClassStudy30 {
    public static void main(String[] args) {
        // 多态的应用2
        // UserInfoByJDBC ui = new UserInfoByJDBC();
        // ui.add(user);
        // ui.delete(user);
        UserInfoDao ui = new UserInfoByJDBC();
        ui.add(user);
        ui.delete(user);
    }
}

/* 需求：数据库操作
 * 用户信息
 * 1、连接数据库 JDBC Hibernate
 * 2、操作数据库
 *    CRUD 增删改查
 * 3、关闭数据库连接
 * */

interface UserInfoDao {
    public void add(User user);

    public void delete(User user);
}


class UserInfoByJDBC implements UserInfoDao {
    public void add(User user) {
        /*1、连接数据库
         * 2、使用sql添加语句添加数据
         * 3、关闭连接*/
    }

    public void delete(User user) {
        /*1、连接数据库
         * 2、使用sql添加语句删除数据
         * 3、关闭连接*/
    }
}

class UserInfoByHibenate implements UserInfoDao {
    public void add(User user) {
        /*1、连接数据库
         * 2、使用sql添加语句添加数据
         * 3、关闭连接*/
    }

    public void delete(User user) {
        /*1、连接数据库
         * 2、使用sql添加语句删除数据
         * 3、关闭连接*/
    }
}