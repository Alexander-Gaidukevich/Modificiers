package modifiers;

public class Main extends Parent {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println("");
        System.out.print("Test1 -> ");
//        System.out.println(t1.name1);//private
        System.out.print(t1.name2 + ", ");//package
        System.out.print(t1.name3 + ", ");//protected
        System.out.println(t1.name4 + " ");//public
        System.out.println("");

        Test2 t2 = new Test2();
        System.out.print("Test2 -> ");
//        System.out.print(t2.name1 + ", ");//private
//        System.out.print(t2.name2 + ", ");//package
//        System.out.print(t2.name3 + ", ");//protected
        System.out.print(t2.name4 + " ");//public
        System.out.println("");

        Parent p = new Parent();
        System.out.println("");
        System.out.print("Parent p -> ");
//        System.out.print(t1.name1 + ", ");//private
        System.out.print(t1.name2 + ", ");//package
        System.out.print(t1.name3 + ", ");//protected
        System.out.print(t1.name4 + " ");//public
        System.out.println("");

    }
}
