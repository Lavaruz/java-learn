public class Main {
    public static void main(String[] args) {
//          Tipe Data Number
        byte iniByte = 10;
        short iniShort = 100;
        int iniInt = 1000;
        long iniLong = 10000;
        System.out.println(iniByte);

//          Tipe data String
        String iniString = "Test String";
        char iniChar = 'C';
        System.out.println(iniString);
        System.out.println(iniChar);

//          Variable and Constant
//        String nama1 = "Assami Muzaki";
        //      java now support var usage without addign specific type, but must init value or error occur
        var nama2 = "Lavaruz";
//              java also have contant
        final String nama = "Assami Muzaki";

        System.out.println("Hello World");
    }
}