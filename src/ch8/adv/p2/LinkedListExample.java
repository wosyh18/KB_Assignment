package ch8.adv.p2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        {
            List<Board> list = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                list.add(new Board(i,i,i));
            }
            System.out.println("객체 갯수: "+ list.size());

            System.out.println("3번째 데이터 :" + list.get(2));

            for (Board board : list) {
                System.out.printf("%d ,%d, %d\n", board.getContent() , board.getWriter() , board.getSubject());
            }

            list.remove(2);

            for (Board board : list) {
                System.out.printf("%d ,%d, %d\n", board.getContent() , board.getWriter() , board.getSubject());
            }
        }
    }
}
