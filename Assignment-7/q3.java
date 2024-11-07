// 3. WAP to design a String class that perform String method(Equal, reverse the string, change case).

class SuperString {

    enum StringCase {
        UPPERCASE,
        LOWERCASE,
        TITLECASE,
        TOGGLECASE,
    }

    protected String internalString;

    public SuperString(String str) {
        this.internalString = str;
    }

    public boolean equals(SuperString other) {
        return this.internalString.equals(other.internalString);
    }

    public SuperString reverse() {
        String rev = "";
        for (int i = this.internalString.length() - 1; i >= 0; i--) {
            rev += this.internalString.charAt(i);
        }

        return new SuperString(rev);
    }

    public SuperString changeCase(StringCase targetCase) {
        String res = "";

        switch (targetCase) {
            case StringCase.UPPERCASE:
                res += this.internalString.toUpperCase();
                break;
            case StringCase.LOWERCASE:
                res += this.internalString.toLowerCase();
                break;
            case StringCase.TITLECASE:
                res += Character.toUpperCase(this.internalString.charAt(0)) + this.internalString.substring(1);
                break;
            case StringCase.TOGGLECASE:
                for (int i = 0; i < this.internalString.length(); i++) {
                    if (Character.isUpperCase(this.internalString.charAt(i))) {
                        res += Character.toLowerCase(this.internalString.charAt(i));
                    } else {
                        res += Character.toUpperCase(this.internalString.charAt(i));
                    }
                }
                break;
        }

        return new SuperString(res);
    }

    public String toString() {
        return this.internalString;
    }
}

class q3 {

    public static void main(String[] args) {
        SuperString str1 = new SuperString("Hello World");
        SuperString str2 = new SuperString("Different String");

        System.out.println("str1 equals str2: " + str1.equals(str2));

        System.out.println("Reversed str1: " + str1.reverse());

        System.out.println("Uppercase: " + str1.changeCase(SuperString.StringCase.UPPERCASE).internalString);
    }
}
