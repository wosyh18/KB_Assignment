package ch2.adv;

public class Database {
    //자신의 유일 객체 생성
    private static Database instance = new Database();

    private String connection = "MySQL";

    //생성자 private으로 막기
    private Database(){
    }

    //외부에서 인스턴스 얻을 수 있도록 설정
    public static Database getDatabase(){
        return instance;
    }

    public void connect(){
        System.out.println(connection + "에 연결합니다.");
        System.out.println("데이터베이스: "+ connection);
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

}
