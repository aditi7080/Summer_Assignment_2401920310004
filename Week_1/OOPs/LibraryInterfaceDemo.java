public class LibraryInterfaceDemo{
    public static void main(String[] args){
        KidUser kid=new KidUser();
         kid.registerAccount(10);
         kid.requestBook("Kids");

         kid.registerAccount(18);
         kid.requestBook("Fiction");



         AdultUser adult=new AdultUser();

         adult.registerAccount(5);
         adult.requestBook("Kids");

         adult.registerAccount(23);
         adult.requestBook("Fiction");
    }
}