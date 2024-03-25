package Programs;

public class TeacherRBCA22105 {
	protected String type;

    public TeacherRBCA22105(String type2) {
		// TODO Auto-generated constructor stub
	}

	// Constructor
    public void TeachersRBCA22105 (String type) {
        this.type = type;
    }

    // Method to print what the teacher teaches
    public void teaches() {
        System.out.println("The teacher is teaching " + type);
    }
}

// Subclass
class TeacherTeaches extends TeacherRBCA22105 {
    private String name;

    // Constructor
    public TeacherTeaches(String type, String name) {
        super(type);
        this.name = name;
    }

    // Method to print the subject
    public void subjects() {
        String type = null;
		System.out.println("The teacher " + name + " is teaching " + type);
    }
}


