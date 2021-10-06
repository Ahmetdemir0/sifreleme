package sifreleme;
import java.util.Scanner;

public class kripto {
    public static void main(String[] args) {
        Scanner klv = new Scanner(System.in);
        System.out.println("lütfen şifrelenmesini istediginiz kelimeyi veya cümleyi girin :");

        String gırılen=klv.nextLine();
        String cumle=gırılen.toLowerCase();


        String[] parca=cumle.split("");
        String cıktı=" ";
        String a="Br";
        String b="Se";
        String c="As";
        String ç="Ge";
        String d="Ga";
        String e="Zn";
        String f="Cu";
        String g="Ni";
        String ğ="Co";
        String h="Fe";
        String i="Mn";
        String ı="Cr";
        String j="V";
        String k="Ti";
        String l="Ca";
        String m="K";
        String n="Ar";
        String o="Cl";
        String ö="S";
        String p="P";
        String r="Al";
        String s="Mg";
        String ş="Na";
        String t="F";
        String u="O";
        String ü="N";
        String v="C";
        String y="B";
        String z="Be";




        for(int eleman=0;eleman<cumle.length();eleman++){
            if(parca[eleman].equals("a"))
            {
                parca[eleman]=a;
                cıktı=cıktı +parca[eleman];

            }else if (parca[eleman].equals("b")) {
                parca[eleman] = b;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("c")) {
                parca[eleman] = c;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ç")) {
                parca[eleman] = ç;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("d")) {
                parca[eleman] = d;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("e")) {
                parca[eleman] = e;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("f")) {
                parca[eleman] = f;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("g")) {
                parca[eleman] = g;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ğ")) {
                parca[eleman] = ğ;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("h")) {
                parca[eleman] = h;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("i")) {
                parca[eleman] = i;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ı")) {
                parca[eleman] = ı;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("j")) {
                parca[eleman] = j;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("k")) {
                parca[eleman] = k;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("l")) {
                parca[eleman] = l;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("m")) {
                parca[eleman] = m;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("n")) {
                parca[eleman] = n;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("o")) {
                parca[eleman] = o;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ö")) {
                parca[eleman] = ö;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("p")) {
                parca[eleman] = p;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("r")) {
                parca[eleman] = r;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("s")) {
                parca[eleman] = s;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ş")) {
                parca[eleman] = ş;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("t")) {
                parca[eleman] = t;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("u")) {
                parca[eleman] = u;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("ü")) {
                parca[eleman] = ü;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("v")) {
                parca[eleman] = v;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("y")) {
                parca[eleman] = y;
                cıktı = cıktı + parca[eleman];
            }else if (parca[eleman].equals("z")) {
                parca[eleman] = z;
                cıktı = cıktı + parca[eleman];
            }
        }

        System.out.println(cıktı);
    }

}