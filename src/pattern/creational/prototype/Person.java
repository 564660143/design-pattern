package pattern.creational.prototype;

import java.util.Date;

/**
 * 原型模式
 *
 * @author 七夜雪
 * @create 2018-11-23 10:51
 */
public class Person implements Cloneable {
    private String name;
    private Integer age;
    private String address;
    private String company;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.birthday = (Date) this.birthday.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", birthday='" + birthday + '\'' +
                ", hashCode='" + hashCode() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
