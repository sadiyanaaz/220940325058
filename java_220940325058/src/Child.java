class GrandParents
{
    String grandFatherName;
    String grandMotherName;

    public GrandParents (String grandFatherName,String grandMotherName)
    {
        this.grandFatherName = grandFatherName;
        this.grandMotherName = grandMotherName;
        System.out.println("The grandParents names are -> grandFatherName :"+grandFatherName+" and " +
                "grandMotherName :"+grandMotherName);
    }

}
class Parents extends GrandParents
{
    String fatherName;
    String motherName;

    public Parents (String grandFatherName,String grandMotherName,String fatherName,String motherName)
    {
        super(grandFatherName,grandMotherName);
        this.fatherName=fatherName;
        this.motherName=motherName;
        System.out.println("The Father name is : "+fatherName+" and Mother name is :"+motherName);
    }

    public Parents(String grandFatherName,String grandMotherName)
    {
        super(grandFatherName,grandMotherName);
    }

}
public class Child extends Parents
{
    public Child(String grandFatherName, String grandMotherName, String fatherName, String motherName)
    {
        super(grandFatherName, grandMotherName, fatherName, motherName);
    }
        public static void main(String[] args)
    {
        Child child = new Child("Jalil Ahmed","Sugra Bano",
                "Saeed Ahmed","Safiya Bano");
        
        System.out.println(child.grandFatherName+" "+ child.grandMotherName+" "+ child.fatherName+" "+ child.motherName);
    }
}
