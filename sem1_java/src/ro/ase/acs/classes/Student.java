package ro.ase.acs.classes;

import java.util.Arrays;

public class Student {
    private String name;
    private float[] grades;
    private TuitionType tuitionType;


    //intr un file am voie sa foloesc doar o data public class,daca vreau sa folosesc public class enum Day inside of Student class, ar trebui sa scriu Student.Day
//    public enum Day{
//        MONDAY, TUESDAY
//    }


    public Student() {
        name = "Anonymous";
        grades = null;
        tuitionType = TuitionType.BUDGET;
    }


    //constructor
    public Student(String name, float[] grades) {
        this.name = name;
        if (grades != null) {
            this.grades = new float[grades.length];
            for (int i = 0; i < grades.length; i++) {
                this.grades[i] = grades[i];
            }
        } else {
            this.grades = null;
        }
    }

    //getters & setters
    public String getName() {
        return name;
    }


    public TuitionType getTuitionType() {
        return tuitionType;
    }

    public float[] getGrades() {
        if(grades!=null){
            float[] copy =new float[grades.length];
            System.arraycopy(grades,0, copy,0, grades.length);
            return copy;
        }
        return null;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setGrades(float[] grades) {
        if (grades != null) {
            this.grades = Arrays.copyOf(grades, grades.length);
        }
        else{
            this.grades=null;
        }
    }

    public void setTuitionType(TuitionType tuitionType) {
        this.tuitionType = tuitionType;
    }

    @Override
    public Object clone() {
        Student studentCopy = new Student();
        studentCopy.name=this.name;
        studentCopy.tuitionType=this.tuitionType;
        studentCopy.setGrades(this.grades);
        return studentCopy;

    }
}
