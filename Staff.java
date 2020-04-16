
public class Staff extends User{

    private int staffId;
    private int penisLength;


    public Staff(int id){
        super(id);
        userType = "staff";
    }

    public Staff(int id, String name){
        super(id, name);
        userType = "staff";
    }

    public Staff(int id, String name, String email){
        super(id, name, email);
        userType = "staff";
    }

    public Staff(int id, String name, String email, int staffId){
        super(id, name, email);
        this.staffId = staffId;
        userType = "staff";
    }

    public Staff(int id, String name, String email, int staffId, int penisLength){
        this(id, name, email, staffId);
        this.penisLength = penisLength;
        userType = "staff";
    }


    public void displayUserInfo(){
        System.out.println(this + " : staff id : " + staffId + " : " + penisLength);
    }



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