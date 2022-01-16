package dao;

import domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> searchStu();
    public int insertOneStu(Student student);
}
