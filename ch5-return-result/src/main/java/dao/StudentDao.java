package dao;

import domain.MyStudent;
import domain.QueryParam;
import domain.Student;
import domain.ViewStudent;
import javafx.beans.binding.ObjectExpression;
import org.apache.ibatis.annotations.Param;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student selectStuById(@Param("myId") Integer id);
    public ViewStudent selectStuReturnViewStudent(@Param("sid") Integer sid);
    Integer countStudent();
    public Map<Object,Object> selectMapById(@Param("myId") Integer id);
    public List<Student> selectAllStu();
    public List<MyStudent> selectAllMyStu();
    public List<MyStudent> selectMyStu();
    public List<Student> selectLikeOne(String name);
    public List<Student> selectLikeTwo(String name);
}
