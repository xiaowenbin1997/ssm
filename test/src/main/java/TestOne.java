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
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = builder.build(in);
        SqlSession sqlSession = ssf.openSession();
        String sqlId = "dao.StudentDao.selectStu";
        List<Student> students = sqlSession.selectList(sqlId);
        students.forEach(System.out::println);
    }
}
