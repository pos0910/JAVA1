public class Student implements Comparable<Student>{
    String name;
    int score;

    Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    public int compareTo(Student other){
        return other.score - this.score;

    }

    public String toString()
    {
        return name + "(" + score + ")" + "점";
    }



}
