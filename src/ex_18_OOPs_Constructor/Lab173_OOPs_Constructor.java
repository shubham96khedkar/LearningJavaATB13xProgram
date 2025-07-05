package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {

Baby b1 = new Baby();
    }
}

class Baby{
//Line no.12 is also callled as Attribute or Instance Variable or Member variables or data members also
    String name;

//Below is a default Constructor
    Baby(){
        System.out.println("I am called, Default Constructor!");
        System.out.println("Your Aadhar Number is ready!");
//USE OF CONSTRUCTOR IS BELOW
//Anything we want to do before creating an object, we can write that code here
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)


    }
}