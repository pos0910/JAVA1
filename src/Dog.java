public class Dog extends Animal implements Swimmable, Trainable {
    String breed;                    // Dog만의 추가 필드

    public Dog(String name) {
        System.out.println(name);
        super(name);
    }

    void eat(){
        super.eat();
        System.out.println((name + "가 꼬리를 흔들며 먹습니다!"));
    }
    void sound(String name){
        System.out.println(name + "가 멍멍! 짖습니다.");
    }
    void bark() {                    // Dog만의 추가 메서드
        System.out.println(name + "가 멍멍! 짖습니다.");
    }


    public void swim(){
        System.out.println(name + "가 수영합니다.");
    };
    public void train(String command){
        System.out.println(name + "가 수영합니다.");

    }
}