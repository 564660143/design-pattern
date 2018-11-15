package creational.prototype;

/**
 * Prototype实现类
 * @author xuxiumeng
 * 2018/11/14 16:59
 */
public class PersonPrototype implements Prototype {
    private String name;
    private String address;
    private String company;
    private String job;

    @Override
    public Prototype clone() {
        PersonPrototype clone = new PersonPrototype();
        clone.name = this.name;
        clone.address = this.address;
        clone.company = this.company;
        clone.job = this.job;
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "PersonPrototype{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
