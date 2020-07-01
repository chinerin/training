package JavaEEDay03.Training_1;

/**
 * @PackageName:JavaEEDay03.Training_1
 * @ClassName:Employee
 * @Description:
 * @author: CK
 * @data: 2020/6/26 19:27
 */
public abstract class Employee {

    private String name;

    private String sex;

    private int age;

    public abstract void work();

    public Employee() {
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
