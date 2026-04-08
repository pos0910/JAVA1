public class Animal {
    String name;
    int age;

    public Animal(String name) {
        this.name = name; // 여기서 저장해줘야 자식들이 name 사용 가능
    }


    void eat(){
        System.out.println(name + "가 밥을 먹습니다.");
    }

    void sound(){
        System.out.println(name + "가 소리를 냅니다.");
    }

    void introduce(){
        System.out.println("[" + name + "] " + age + "살");
    }


}
