package string1;

public class HelloName {
    public static void main(String[] args) {

        HelloName obj = new HelloName();
        System.out.println(obj.makeOutWord("<<>>", "Yay"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) +
                str.substring(str.length() - 2);
    }

    public String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        }
        return str;
    }

    public String right2(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() -2) + str.substring(0, str.length() - 2);
        }
        return str;
    }

    public String theEnd(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() -1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2 || str.length() == 0) {
            return "";
        } else if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid +1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + (str.substring(str.length() - n));
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() == 0) {
            return false;
        } else if (str.substring(0).startsWith("bad")) {
            return true;
        } else if (str.substring(1).startsWith("bad")) {
            return true;
        } else {
            return false;
        }
    }

    public String atFirst(String str) {
        if (str.length() == 1) {
            return str.substring(0) + '@';
        } else if (str.length() == 0) {
            return "@@";
        } else {
            return str.substring(0, 2);
        }
    }

    public String lastChars(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        } else if (a.isEmpty()) {
            return "@" + b.substring(b.length() - 1);
        } else if (b.isEmpty()) {
            return a.substring(0, 1) + "@";
        } else {
            return a.substring(0, 1) + b.substring(b.length()-1);
        }
    }

    public String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        } else if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, str.length()-2)
                    +str.substring(str.length() - 1)
                    +str.substring(str.length() - 2, str.length() - 1);
        } else {
            return str;
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")){
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }else{
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        } else if (a.length() > b.length()) {
            a = a.substring(a.length() - b.length());
        } else {
            b =  b.substring(b.length() - a.length());
        } return a+ b;
    }

    public String extraFront(String str) {
        if (str.length() >= 2){
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        } else {
            return str + str + str;
        }
    }

    public String without2(String str) {
        if (str.length() == 1) {
            return str;
        } else if (str.length() < 2) {
            return str;
        } else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str.substring(0);
        } else if (str.charAt(0) == 'a') {
            return str.substring(0, 1) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

    public String startWord(String str, String word) {
        if (str.startsWith(word)) {
            return word;
        } else if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        } else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.equals("x")) {
            return "";
        } else if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.startsWith("x")) {
            return str.substring(1);
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else if (str.length() > 1 && str.contains("x")) {
            return str;
        } else {
            return str;
        }
    }

    public String withoutX2(String str) {
        if (str.length() <= 1) {
            return "";
        } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            return str.substring(2);
        } else if (str.charAt(0) == 'x') {
            return str.substring(1);
        } else if (str.charAt(1) == 'x') {
            return str.substring(0, 1) + str.substring(2);
        } else {
            return str;
        }
    }
}
