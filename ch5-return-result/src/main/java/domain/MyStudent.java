package domain;

public class MyStudent {
    private Integer stuId;
    private String stuName;
    private String stuEmail;
    private Integer stuAge;

    public MyStudent(Integer stuId, String stuName, String stuEmail, Integer stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuEmail = stuEmail;
        this.stuAge = stuAge;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "MyStudent{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
