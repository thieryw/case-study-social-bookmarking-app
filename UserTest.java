
public class UserTest {

    public static void printUserType(User u){
        u.printUserType();
    }



    public static void main(String[] args) {
    /*    User u = new User();
        User s = new Staff();
        User e = new Editor();

        User[] userList = new User[]{u ,s, e};

        if(u instanceof User){
            printUserType(u);
        }

        if(u instanceof Staff){
            printUserType((Staff) u);
        }

        if(u instanceof Editor){
            printUserType((Editor) u);
        }


        int i = 1;
        Review review = new Review("");

        for (User user : userList) {

            review = user.postAReview("review " + i);
            review.printReviewText();
            System.out.println(review.isApproved());

        }

        System.out.println("\n\n\n");

        s.displayUserInfo();

        u.displayUserInfo();

        System.out.println(s.equals(u));

        User s2 = new Staff();

        System.out.println(s.equals(s2));*/

        User staff = new Staff(1, "william", "william@email.com", 10);

        User staff2 = new Staff(2, "joseph", "joseph@email.com", 11, 25);

        User user = new User(3, "alexy", "alexy@email.com");

        User editor = new Editor(4, "florian", "florian@email.com", 12, 44);

        staff.displayUserInfo();

        staff2.displayUserInfo();

        user.displayUserInfo();

        editor.displayUserInfo();
        



            

    }



}