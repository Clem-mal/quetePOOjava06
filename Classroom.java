public class Classroom {
    
    public static void main(String[] args){
        Wilder donald = new Wilder("Duck", false);
        Wilder maitre = new Wilder ("Maître Numa", true);

        System.out.println(donald.whoAmI());
        System.out.println(maitre.whoAmI());

    }
    
}
