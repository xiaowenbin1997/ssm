import dao.StudentDao;
import domain.QueryParam;
import domain.Student;
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
        Student student = studentDao.selectStudentById(1006);
        System.out.println(student);
    }
    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> stuLists = studentDao.selectMaltiParam("王五",19);
        for (Student student :stuLists) {
            System.out.println(student);
        }
    }
    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        QueryParam queryParam = new QueryParam("啊这",20);
        List<Student> studentList = studentDao.selectMultiObject(queryParam);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
    @Test
    public void test04() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Student student = new Student("王五",20);
        List<Student> students = studentDao.selectMultiStu(student);
        for (Student stu : students) {
            System.out.println(stu);
        }
    }
    @Test
    public void test05() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        Map<String,Object> map = new HashMap<>();
        map.put("name","王五");
        map.put("age",111);
        List<Student> students = studentDao.selectMultiByMap(map);
        students.stream().forEach(System.out::println);
    }
    @Test
    public void test06() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        //可能会被sql注入
        List<Student> stus = studentDao.selectUse$("'王五'");
        stus.stream().forEach(System.out::println);
    }
    @Test
    public void test07() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
        List<Student> studentList = studentDao.selectUse$Order("id");
        studentList.stream().forEach(System.out::println);
    }
}
