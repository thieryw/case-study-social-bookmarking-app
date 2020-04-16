
public class Staff extends User{



    public Staff(){
        userType = "staff";
        id = 2;
    }

   /* public void displayUserInfo(){
        System.out.println(id);
        System.out.println(userType);
    }
*/


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