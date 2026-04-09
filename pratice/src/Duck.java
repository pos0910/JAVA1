public class Duck extends Animal{
    public Duck(String name) {
        super(name);

    }

    void eat(){
        System.out.println((name + "가 꼬리를 흔들며 먹습니다!"));
    }

    void sound(){
        System.out.println((name + "가 꽥꽥"));
    }

    void bark() {                    // Dog만의 추가 메서드
        System.out.println(name + "가 멍멍! 짖습니다.");
    }

}
