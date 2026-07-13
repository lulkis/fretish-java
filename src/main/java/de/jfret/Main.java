package de.jfret;

public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        for(String str : args) {
            s.append(str).append(" ");
        }

        Fret2ptLTL parser = new Fret2ptLTL();

        System.out.println(parser.compileToPtLtl(s.toString()));
    }
}
