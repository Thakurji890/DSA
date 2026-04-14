package Day5;

public class OOPs {
    public static void main(String[] args) {
        // AppForm s1 = new AppForm();

        AppForm s1 = new AppForm("Aniket", 21);
        // AppForm s2 = new AppForm("Aniket", 21);

        s1.setName("Manesh Thakur");
        s1.setAge(22);
        s1.display();

        System.out.println("No of student : " + AppForm.count);
    }

}

class AppForm {
    private String name;
    private int age;
    static int count = 0;

    AppForm(String name, int age) {
        count++;
        if (!name.equals(""))
            this.name = name;
        if (age > 0)
            this.age = age;
    }

    void setName(String name) {
        if (!name.equals(""))
            this.name = name;
    }

    void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    void display() {
        System.out.println("Name : " + getName() + "\nAge : " + getAge());
    }
}