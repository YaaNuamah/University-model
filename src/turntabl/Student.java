package turntabl;

public class Student {
    public String Name;
    private int ID;
    private YearofStudent yearofStudent;

    public Student(String name, int ID, YearofStudent yearofStudent) {
        Name = name;
        this.ID = ID;
        this.yearofStudent = yearofStudent;
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }

    public YearofStudent getYearofStudent() {
        return yearofStudent;
    }

    @Override
    public String toString() {
        return "turntabl.Student{" +
                "Name='" + Name + '\'' +
                ", ID=" + ID +
                ", yearofStudent=" + yearofStudent +
                '}';
    }

    }





