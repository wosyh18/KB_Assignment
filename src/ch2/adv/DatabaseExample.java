package ch2.adv;

public class DatabaseExample {
    public static void main(String[] args) {

        //객체를 생성하는 것이 아닌 get메서드로 가져오기
        Database db = Database.getDatabase();

        db.connect();

        db.close();


    }
}
