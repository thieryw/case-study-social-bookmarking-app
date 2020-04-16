
public class User {

    protected int id = 1;

    protected String userType = "User";

    public void displayUserInfo(){
        System.out.println(this);
    }

    public void printUserType(){
        System.out.println("User");
    }

    public void saveWebLink(){
        System.out.println("User: saveWebLink");
        //postAReview();
    }

    public String toString(){

        return userType + " : " + id;

    }

    public boolean equals(User u){
        return this.id == u.id && this.userType == u.userType;
    }

    public Review postAReview(String reviewText){

        System.out.println("User: postAReview");

        return new Review(reviewText);

        
        
    }

    
}
