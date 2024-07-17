import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        //ArrayList<Integer> list01 = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        // 추가
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 중간삽입
        list.add(5, 10);
        list.add(1, 20);

        // 치환
        list.set(0, 5);
        list.set(4, 13);

        System.out.println(list);

        // 삭제 - 공간도 지워짐.. 하나씩 밀린다.
        list.remove(4);
        list.remove(3);

        System.out.println(list);

        // 출력!
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + "\t");
        }
        System.out.println("\n===========================");

        for(int val : list) {
            System.out.println(val + "\t");
        }

        System.out.println("\n===========================");

        // iterator을 이용한 출력
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + "\t");
        }
    }
}