import dao.StudentDao;
import domain.MyStudent;
import domain.QueryParam;
import domain.Student;
import domain.ViewStudent;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import utils.MyBatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOne {
    @Test
    public void test01() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = studentDao.selectStuById(3);
        System.out.println(student);
    }
    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        ViewStudent viewStudent = studentDao.selectStuReturnViewStudent(6);
        System.out.println(viewStudent);
    }
    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Integer countStudent = studentDao.countStudent();
        System.out.println("学生总数为：" + countStudent);
    }
    @Test
    public void test04() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Map<Object, Object> resultMap = studentDao.selectMapById(5);
        System.out.println(resultMap);
    }
    @Test
    public void test05() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = studentDao.selectAllStu();
        students.stream().forEach(System.out::println);
    }
    @Test
    public void test06() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = studentDao.selectAllMyStu();
        students.stream().forEach(System.out::println);
    }
    @Test
    public void test07() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<MyStudent> students = studentDao.selectMyStu();
        students.stream().forEach(System.out::println);
    }
    @Test
    public void test08() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = studentDao.selectLikeOne("%l%");
        students.stream().forEach(System.out::println);
    }
    @Test
    public void test09() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> students = studentDao.selectLikeTwo("余");
        students.stream().forEach(System.out::println);
    }
}
