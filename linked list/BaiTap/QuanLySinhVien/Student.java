public class Student {
    private int mssv;
    private String name;
    private float gpa;

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(int mssv, String name, float gpa) {
        this.mssv = mssv;
        this.name = name;
        this.gpa = gpa;
    }
}
