package demos;

public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        System.out.println(tasks.findSymbolOccurrence("Hillel school", 'h')); //expected - 2
        System.out.println(tasks.findWordPosition("Hillel school", "step"));//expected - -1
        System.out.println(tasks.findWordPosition("Hillel school", "ool"));//expected - 10
        System.out.println(tasks.stringReverse("Hillel")); //expected - lelliH
        System.out.println(tasks.isPalindrome("Radar")); //expected - true
        System.out.println(tasks.isPalindrome("Hillel")); //expected - false
    }


}
