public class SwitchCase {
    public static void main(String[] args) {
        var nilai = 'A';
//        WITH YILED (JAVA 14)
        var ucapan = switch (nilai){
            case'A': yield "Wow gg";
            case'B': yield "mayan";
            case'C': yield "hmm";
            default: yield "buset dah cacad";
        };
        System.out.println(ucapan);

//        WITH LAMBDA SWITCH (JAVA 10)
        switch (nilai){
            case 'A' -> System.out.println("wow hebat");
            case 'B' -> System.out.println("Lumayaan");
            default -> System.out.println("jir jelek");
        }
    }
}
