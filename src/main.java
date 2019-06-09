
public class main {
    public static void main(String[] args) {


        String[] materii={"Matemtica","Romana","Fizica"};

        int[][] note={{10,10,10},{10,9,8},{9,5,8}};
        Student s1=new Student("Gigel",materii,note);
        System.out.println(s1);
        s1.mediaAnuala();



        int[][] note02={{4,3,2,},{7,6,5},{4,3,4}};
        Student s2=new Student("Marian",materii,note02);
        System.out.println(s2);
        s2.mediaAnuala();


    }


}
