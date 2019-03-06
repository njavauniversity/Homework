package tamrin3;

import java.util.ArrayList;

public class Studentexe {

    public static void main(String[] args) {


        ArrayList<Student> starr = new ArrayList<Student>();

        Student st1 = new Student();

        st1.name = "ali";
        st1.family = "alavi";

        Course co1 = new Course();
        co1.cname = "riazi";
        co1.cnum = 3;

        Course co2 = new Course();
        co2.cname = "olom";
        co2.cnum = 2;

        Course co3 = new Course();
        co3.cname = "naghashi";
        co3.cnum = 1;

        st1.c1.add(co1);
        st1.c1.add(co2);
        st1.c1.add(co3);

        st1.h1.put(co1, 18);
        st1.h1.put(co2, 15);
        st1.h1.put(co3, 20);

        Student st2 = new Student();

        st2.name = "mohammad";
        st2.family = "darabi";

        Course co2_1 = new Course();
        co2_1.cname = "riazi";
        co2_1.cnum = 3;

        Course co2_2 = new Course();
        co2_2.cname = "olom";
        co2_2.cnum = 2;

        Course co2_3 = new Course();
        co2_3.cname = "naghashi";
        co2_3.cnum = 1;

        st2.c1.add(co2_1);
        st2.c1.add(co2_2);
        st2.c1.add(co2_3);

        st1.h1.put(co2_1, 15);
        st1.h1.put(co2_2, 10);
        st1.h1.put(co2_3, 13);

        starr.add(st1);
        starr.add(st2);

//----------------------------------------------------

        for (Student stutemp : starr) {


            System.out.println(stutemp.name);
            System.out.println(stutemp.family);

            for (Course stemp1 : stutemp.c1) {
                System.out.println(stemp1.cname);
                System.out.println(stemp1.cnum);
                System.out.println(st1.h1.get(stemp1));
            }
            System.out.println("-----------------------------------");
        }

    }

}
