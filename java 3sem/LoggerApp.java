public class LoggerApp{
  public static void main(String[] args){
    Users user1 = new Users("adminUser", "admin123", "Administrator");

  System.out.println("the adminUser" + user1.username);
  System.out.println("final field" + Users.SYSTEM_NAME );
  System.out.println("rles" + user1.role);

  System.out.println("\nUsing public method to show user details:");
  user1.showUserDetails();
  }
}