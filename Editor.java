
public class Editor extends Staff{

    public Editor(int id, String name, String email, int staffId, int penisLength) {
        super(id, name, email, staffId, penisLength);
    }

    public void printUserType() {
        System.out.println("Editor");
    }

    public void approveReview(){
        System.out.println("Editor: approveReview");
    }

}