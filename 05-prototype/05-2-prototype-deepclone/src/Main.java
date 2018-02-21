public class Main{
    public static void main(String args[]){
        Email email, copyEmail = null;
        email = new Email();
        try{
            copyEmail = (Email)email.deepClone();
            System.out.printf("email==copyEmail ? %s\n", email==copyEmail ? "yes" : "no");
            System.out.printf("email.getAttachment==copyEmail.getAttachment ? %s\n", email.getAttachment()==copyEmail.getAttachment() ? "yes" : "no");
		}
		catch(Exception e)
	    {
	   		e.printStackTrace();
	    }
    }
}