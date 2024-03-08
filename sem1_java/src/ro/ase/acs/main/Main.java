package ro.ase.acs.main;

import ro.ase.acs.classes.Student; //sau .* daca vreau sa import toate clasele
import ro.ase.acs.classes.TuitionType;

public class Main {
    public static void main(String[] args)
    {
        Student s1 =  new Student();
        s1.setName("John");
        s1.setTuitionType(TuitionType.TAX);
        float[] array=new float[]{5.00f,6.00f,7.00f};
        Student s2=new Student("Andrei", array);
        array[0] =4.00f;
        for (float v:array){
            System.out.println(v);
        }
        Student s3 = (Student) s2.clone();
    }
}