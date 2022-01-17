package dao;

import domain.QueryParam;
import domain.Student;
import org.apache.ibatis.annotations.Param;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    public List<Student> searchStu();
    public int insertOneStu(Student student);
    public Student selectStudentById(@Param("studentId")Integer id);
    public List<Student> selectMaltiParam(@Param("myname") String name,
                                          @Param("myage") Integer age);

    List<Student> selectMultiObject(QueryParam queryParam);
    List<Student> selectMultiStu(Student student);
    List<Student> selectMultiByMap(Map<String,Object> map);
    List<Student> selectUse$(@Param("name") String name);
    List<Student> selectUse$Order(@Param("colName") String colName);
}
