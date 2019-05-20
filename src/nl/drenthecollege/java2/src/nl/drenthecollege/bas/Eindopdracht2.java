package nl.drenthecollege.bas;

public class Eindopdracht2 {

        public static void main(String[] args) {


            String tekst = new String("Dit is een tekst met \" en ** en ?? en " +
                    "allerlei andere niet wenselijke tekens zoals ® etc. ");

            System.out.println(replaceString(tekst));
        }

        public static String replaceString(String tekst){
        char[] delete = {'®', '?', '*', '"'};

         for (char x : delete) {
           tekst = tekst.replace(x, ' ');
         }
         return tekst;
        }
    }
