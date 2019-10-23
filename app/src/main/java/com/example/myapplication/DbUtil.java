package com.example.myapplication;

import com.example.myapplication.dao.DaoMaster;
import com.example.myapplication.dao.DaoSession;
import com.example.myapplication.dao.PersonDao;

import java.util.List;

public class DbUtil {
    private static DbUtil dbUtil;
    private final PersonDao personDao;

    private DbUtil() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(GreenDao.getApp(), "stu.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        personDao = daoSession.getPersonDao();
    }

    public static DbUtil getDbUtil() {
        if (dbUtil == null) {
            synchronized (DbUtil.class) {
                if (dbUtil == null) {
                    dbUtil = new DbUtil();
                }
            }
        }
        return dbUtil;
    }

    //插入
    public long insert(Person person) {
        if (!isInserted(person)) {
            long l = personDao.insertOrReplace(person);
            return l;
        }
        return -1;
    }

    //删除
    public boolean delete(Person person) {
        if (isInserted(person)) {
            personDao.delete(person);
            return true;
        }
        return false;
    }

    public boolean isInserted(Person person) {
        List<Person> list = personDao.queryBuilder().where(PersonDao.Properties.Food.eq(person.getFood())).list();
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //查询
    public List<Person> queryAll() {
        List<Person> list = personDao.queryBuilder().list();
        return list;
    }

    //模糊查询
    public List<Person> queryLike(String person) {
        List<Person> list = personDao.queryBuilder().where(PersonDao.Properties.Food.like("%" + person + "%")).list();
        return list;
    }

}
