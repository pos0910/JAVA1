public class Report implements Printable, Saveable, Exportable{
    private String title;
    private String content;

    Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void print() {            // Printable 구현
        System.out.println("=== " + title + " ===");
        System.out.println(content);
    }

    public void save(String filename) {  // Saveable 구현
        System.out.println("'" + title + "'을 " + filename + "에 저장했습니다.");
    }

    public String toCSV() {         // Exportable 구현
        return "[EXPORT] " + title + ": " + content;
    }

}
