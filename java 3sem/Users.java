class Users{
  private String password;
  protected String role;
  public String username;
  public final static String SYSTEM_NAME = "AccessLogger";
 
  Users(String password,String role,String username) {
    this.password=password;
    this.role=role;
    this.username=username;
  }

   public void showUserDetails(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
        System.out.println("System Name: " + SYSTEM_NAME);
  }
}