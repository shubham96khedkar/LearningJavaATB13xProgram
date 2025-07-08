package ex_28_ENUM;

public enum Colors {

    RED("#FF0000"),
//In above line FF0000 is hexadecimal code for Red color
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;
 //in above line there is an instance variable

    Colors(String hexCode) {
//In above line it is a parametrised constructor
        this.hexCode = hexCode;
    }

    String getHexCode() {
        return this.hexCode;
    }

}
