package c18_static.singleton.databases;

public class DatabaseConnection {
    // 싱글톤 패턴을 위한(유일한 인스턴스를 저장하기 위한) 정적 변수 선언
    private static DatabaseConnection instance = null;

    // 생성자를 private 으로 선언하여 외부에서 직접 인스턴스를 생성 할 수 없도록 함.
    private DatabaseConnection(){
        System.out.println("데이터베이스를 연결하였습니다.");
    }

    // 유일한 인스턴스를 반환하는 정적 메서드
    public static DatabaseConnection getInstance(){
        // 여기서 싱글톤 패턴 검색하셔가지고 작성
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // 데이터베이스 연결을 닫는 메서드
    public void closeConnection(){
        System.out.println("데이터베이스 연결을 끊었습니다.");
    }
}
