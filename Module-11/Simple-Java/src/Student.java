public class Student {
    static int count;
    static {
        count =0;
    }

    static void currentCount(){
        System.out.println("Current student object count: "+ count);
//        System.out.println(mark);
    }
    private int id;
    private int mark;

    public Student() {
        this(0,0);
    }

    public Student(int id, int mark) {
        count++;
        this.id = id;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("ID: "+ id + "Mark: "+ mark);
    }
}
