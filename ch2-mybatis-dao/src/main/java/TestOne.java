import dao.impl.StudentDaoImpl;
import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.List;

public class TestOne {
    public static void main(String[] args) throws IOException {
        StudentDaoImpl stuDapImpl = new StudentDaoImpl();
        List<Student> students = stuDapImpl.searchStu();
        for (Student stu : students) {
            System.out.println("学生:" + stu);
        }
    }
}
