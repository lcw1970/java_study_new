package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students ={90,80,70,60,50}; // 배열 생성과 초기화

        for (int i = 0; i <students.length ; i++) {
            System.out.printf("학생 %d의 점수: %d\n",i+1,students[i]);
        }
    }
}
