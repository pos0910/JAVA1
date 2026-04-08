public class Cat extends Animal {
              // Cat만의 추가 필드
    public Cat(String name) {
        super(name);

    }

    void purr() {                    // Cat만의 추가 메서드
        System.out.println(name + "가 그르르~ 합니다.");
    }
}
