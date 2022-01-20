import com.github.pagehelper.PageHelper;
import dao.StudentDao;
import domain.QueryParam;
import domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOne {
    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setAge(20);
        student.setName("王五");
        List<Student> students = studentDao.selectStudentIf(student);
        for (Student stu : students) {
            System.out.println(stu);
        }
    }
    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("王五");
        student.setAge(30);
        studentDao.selectStudentWhere(student);
    }
    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Integer> stuIdList = new ArrayList<>();
        stuIdList.add(1);
        stuIdList.add(66);
        stuIdList.add(2);
        studentDao.selectForeachOne(stuIdList);
    }
    @Test
    public void test04() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1));
        stuList.add(new Student(2));
        stuList.add(new Student(66));
        studentDao.selectForeachTwo(stuList);
    }
    @Test
    public void testPageHelper() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> stuList = new ArrayList<>();
        PageHelper.startPage(1,3);
        stuList = studentDao.selectAll();
        for (Student student : stuList) {
            System.out.println(student);
        }
    }
}
