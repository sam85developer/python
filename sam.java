public class sam {
    public static int update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 3;
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks [] = {10,20,30};
        update(marks);
        for(int i = 0;i<marks.length;i++){
            System.out.println("update marks : " + marks[i]);
        }

    }
}