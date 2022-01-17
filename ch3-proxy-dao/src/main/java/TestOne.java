import dao.StudentDao;
import domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import utils.MyBatisUtils;

import java.util.List;

public class TestOne {
    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        System.out.println("dao is " + studentDao.getClass().getName());
        System.out.println("dao fields is " + studentDao.getClass().getFields());
        List<Student> students = studentDao.searchStu();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student(22,"王五","12345@163.com",999);
        int result = studentDao.insertOneStu(student);
        sqlSession.commit();
        System.out.println("插入数据条数 " + result);
    }
}
