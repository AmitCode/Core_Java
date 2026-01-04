package streams.StreamCodingProblems.arrays;

public class StringAreImmutable {
    public static void main(String[] args) {
        String name = "Amit";
        System.out.println("String: " + name + ", Hash Code: " + name.hashCode());
        name = name + " Kumar";
        System.out.println("String: " + name + ", Hash Code: " + name.hashCode());
        name = name + " Pandey";
        System.out.println("String: " + name + ", Hash Code: " + name.hashCode());
    }
}
