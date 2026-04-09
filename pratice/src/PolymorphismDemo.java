public class PolymorphismDemo {
    public static void main(String[] args) {
        // === 업캐스팅: 부모 타입에 자식 객체 담기 ===
        Animal a1 = new Dog("바둑이");    // Animal 타입에 Dog 객체
        Animal a2 = new Cat("나비");      // Animal 타입에 Cat 객체
        Animal a3 = new Duck("도널드");   // Animal 타입에 Duck 객체

        // === 같은 타입(Animal)이지만 다른 결과! ===
        a1.sound();                  // Dog의 sound() → 멍멍!
        a2.sound();                  // Cat의 sound() → 야옹~
        a3.sound();                  // Duck의 sound() → 꽥꽥!

        // === 부모에 없는 메서드는 호출 불가 ===
        // a1.bark();                // 컴파일 에러! Animal에 bark() 없음

        // === 배열로 일괄 관리 ===
        Animal[] zoo = {a1, a2, a3};
        System.out.println("\n=== 동물원 전체 소리 ===");
        for (Animal animal : zoo) {
            animal.sound();          // 각자 다른 소리!
        }
    }
}