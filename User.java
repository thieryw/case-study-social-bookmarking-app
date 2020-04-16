
public class User {

    protected int id;

    protected String userType = "User";

    private String name;

    private String email;


    public User(int id){
        this.id = id;
    }

    public User(int id, String name){
        this(id);
        this.name = name;
    }

    public User(int id, String name, String email){
        this(id, name);
        this.email = email;
    }



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

        return userType + " : " + id + " : " + name + " : " + email;

    }

    public boolean equals(User u){
        return this.id == u.id && this.userType == u.userType;
    }

    public Review postAReview(String reviewText){

        System.out.println("User: postAReview");

        return new Review(reviewText);

        
        
    }

    
}
