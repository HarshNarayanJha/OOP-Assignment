// 5. Write a Java program that implement the concept of Encapsulation.

class Data {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class q5 {

    public static void main(String[] args) {
        Data age = new Data();
        age.setAge(18);
        System.out.println("The age of the person is: " + age.getAge());
        // age.age won't work!
    }
}
