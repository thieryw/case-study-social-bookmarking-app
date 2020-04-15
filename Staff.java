
public class Staff extends User{
    public void printUserType(){
        System.out.println("Staff");
    }

    public Review postAReview(String reviewText){

        System.out.println("Staff: postAReview");

        Review review = super.postAReview(reviewText);

        review.setApproved(true);

        return review;
    }

}