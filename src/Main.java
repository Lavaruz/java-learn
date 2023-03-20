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


//          Array
        String[] iniArray;
        iniArray = new String[3];
//
        int[] iniArray2 = {
                1,2,3
        };
        int[] iniArray3 = new int[]{
                4,5,6
        };

        iniArray[0] = "Brodi";
        iniArray[1] = "Boday";
        iniArray[2] = "Budiy";
        System.out.println(iniArray2[0]);
        System.out.println(iniArray3[0]);

//          SWITCH LAMBDA

        var nilai = 'C';

        switch (nilai){
            case 'A' -> System.out.println("wow hebat");
            case 'B' -> System.out.println("Lumayaan");
            default -> System.out.println("jir jelek");
        }
    }
}