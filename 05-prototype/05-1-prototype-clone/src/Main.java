public class Main{
    public static void main(String args[]){
        Email email, copyEmail;
        email = new Email();
        copyEmail = (Email)email.clone();
        System.out.printf("email==copyEmail ? %s\n", email==copyEmail ? "yes" : "no");
        System.out.printf("email.getAttachment==copyEmail.getAttachment ? %s\n", email.getAttachment()==copyEmail.getAttachment() ? "yes" : "no");
    }
}