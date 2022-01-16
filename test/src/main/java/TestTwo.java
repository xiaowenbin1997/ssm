import domain.Student;
import org.apache.ibatis.session.SqlSession;
import utils.MyBatisUtils;

public class TestTwo {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSession();
        String sqlId = "dao.StudentDao.insertStu";
        Student student = new Student(2,"lalla","111@qq.com",99);
        int count = sqlSession.insert(sqlId,student);
        sqlSession.commit();
        System.out.println("插入的数据是" + count + "条");
    }
}
