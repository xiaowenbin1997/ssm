import dao.impl.StudentDaoImpl;
import domain.Student;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisUtils;

public class TestTwo {
    public static void main(String[] args) {
        StudentDaoImpl stuDaoImpl = new StudentDaoImpl();
        Student student = new Student(3,"王五","111@qq.com",33);
        int i = stuDaoImpl.insertOneStu(student);
        System.out.println("插入数据条数为" + i);
    }
}
