package student;

import java.util.List;

public class  Student
    implements Nameable, HasLevel
{

    private String name;
    private Level lvl;
    private List<Double> grades;

    public Student(String name, Level lvl, List<Double> grades) {
        this.name = name;
        this.lvl = lvl;
        this.grades = grades;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.lvl;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", grades=" + grades +
                '}';
    }

    public Double getAverageGrade() {

        Double average = 0.0;
        Double sumGrade = 0.0;
        for (Double grade : grades) {
            sumGrade += grade; }
        average = sumGrade / grades.size();
        return  average;

        }

//    public Level getLvl() {
//        Level firstYr = Level.First;
//        Level secondYr =Level.Second;
//        Level thirdYr =Level.Third;
//        Level fourthYr =Level.Fourth;
//        return Leve;
//    }


}



