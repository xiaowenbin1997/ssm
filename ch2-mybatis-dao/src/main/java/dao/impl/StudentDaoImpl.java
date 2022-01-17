package dao.impl;

import dao.StudentDao;
import domain.Student;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisUtils;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> searchStu() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        String sqlId = "dao.StudentDao.selectStu";
        List<Student> stuList = sqlSession.selectList(sqlId);
        return stuList;
    }

    @Override
    public int insertOneStu(Student student) {
        SqlSession sqlSession = MyBatisUtils.getSession();
        String sqlId = "dao.StudentDao.insertStu";
        int count = sqlSession.insert(sqlId, student);
        sqlSession.commit();
        return count;
    }
}
