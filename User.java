
public class User {

    public void printUserType(){
        System.out.println("User");
    }

    public void saveWebLink(){
        System.out.println("User: saveWebLink");
        //postAReview();
    }

    public Review postAReview(String reviewText){

        System.out.println("User: postAReview");

        return new Review(reviewText);

        
        
    }

    
}
