// class p4 {
//     public static void main(String... args) {
//         System.out.println("String Main is Working");

//     }
// }
// class Child extends p4
// {
//     public static void main(String[] args) {
//         System.out.println("Child class main");
//     }
// }
// class Parent
// {
//     static
//     {
//         System.out.println("Static Block");
//     }
//     public static void main(String[] args) {
//         System.out.println("Main Method");
//     }
// }

class Parent
{
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
