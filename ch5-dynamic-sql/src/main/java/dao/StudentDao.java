package dao;

import domain.QueryParam;
import domain.Student;
import org.apache.ibatis.annotations.Param;
import org.w3c.dom.ls.LSInput;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    //动态sql ，使用java对象作为参数
    List<Student> selectStudentIf(Student student);

    //where使用
    List<Student> selectStudentWhere(Student student);

    //foreach 用法 1
    List<Student> selectForeachOne(List<Integer> idlist);

    //foreach 用法 2
    List<Student> selectForeachTwo(List<Student> stulist);

    //测试pagehelper
    List<Student> selectAll();
}
