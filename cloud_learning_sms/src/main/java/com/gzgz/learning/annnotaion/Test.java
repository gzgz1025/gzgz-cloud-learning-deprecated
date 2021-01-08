package com.gzgz.learning.annnotaion;

/**
 * @ClassName: Test
 * @Description:
 * @Author: pzl
 * @CreateDate: 2021/1/8 14:43
 * @Version: 1.0
 */
public class Test {
    //拿到sql语句
    private String sql;


    @Insert("insert into user values(1,2,3,4)")
    public void insert(){
        System.out.println(sql);
    }

    public static void main(String[] args) {
        Test userDao = new Test();
        SqlParser.inject(userDao);
        System.out.println(userDao.sql);
    }
}
