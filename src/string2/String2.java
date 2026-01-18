package string2;

public class String2 {

    public String doubleChar(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res = res + str.charAt(i) + str.charAt(i);
        }
        return res;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public boolean xyzThere(String str) {
        if (str.length() < 3) {
            return false;
        }
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0) {
                    return true;
                } else if (i > 0 && str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        return lastX == -1 || str.lastIndexOf('y') > lastX;
    }

    public String mixString(String a, String b) {
        StringBuilder res = new StringBuilder();
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                res.append(a.charAt(i));
            }
            if (i < b.length()) {
                res.append(b.charAt(i));
            }
        }
        return res.toString();
    }

    public String repeatEnd(String str, int n) {
        String res = "";
        String rep = str.substring(str.length() - n);
        for (int i = 0; i < n; i++) {
            res = res + rep;
        }
        return res;
    }

    public String repeatFront(String str, int n) {
        String res = "";
        for (int i = n; i > 0; i--) {
            String rep = str.substring(0, i);
            res = res + rep;
        }
        return res;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String res = "";
        if (count == 0) {
            return "";
        }
        for (int i = 0; i < count - 1; i++) {
            res += word + sep;
        }
        res += word;
        return res;
    }

    public boolean prefixAgain(String str, int n) {
        String pre = str.substring(0, n);
        return str.indexOf(pre, 1) != -1;
    }

    public boolean xyzMiddle(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = str.length() - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first == -1) {
            return "";
        }
        if (first == last) {
            return "";
        } else {
            return str.substring(first + 5, last);
        }
    }

    public boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0 || i == str.length() - 1) {
                    continue;
                }
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
                if ((str.charAt(i) == '*') && str.charAt(i - 1) == str.charAt(i + 1)) {
                }
            }
        }
        return true;
    }

    public String oneTwo(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 3 <= str.length()) {
                res.append(str.charAt(i + 1));
                res.append(str.charAt(i + 2));
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public String zipZap(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                continue;
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public String starOut(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public String plusOut(String str, String word) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                res += word;
                i += word.length() - 1;
            } else {
                res += "+";
            }
        }
        return res;
    }

    public String wordEnds(String str, String word) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= str.length() - word.length(); i++) {
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i > 0) {
                    res.append(str.charAt(i - 1));
                }
                if (i + word.length() < str.length()) {
                    res.append(str.charAt(i + word.length()));
                }
            }
        }
        return res.toString();
    }
}
