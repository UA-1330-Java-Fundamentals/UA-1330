/*
Create a class called Department that contains a name field of String type and an address
field of Address type.
• In the Department class, create an inner class called Address with has city and street
fields of String type and building field of type int.
• In main() method, create an instance for one department and initialize it.
• Then, create one more department by cloning previously created department and change
the city for this object.
• Output information about all departments to the console.
*/

package HomeWorkFromPDF.HomeWorkFromPDF8;

class Department implements Cloneable{
    String name;
    Address address;

    static class Address{
        String city;
        String street;
        int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Department clone() throws CloneNotSupportedException{
        Department myClone = (Department) super.clone();
        return myClone;
    }
}

public class practicalTask1{
    public static void main(String[] args) throws Exception{
        Department.Address address = new Department.Address("Kyiv", "Main Street", 10);
        Department department = new Department("First", address);

        System.out.println("Department: " + department.name);
        System.out.println("City: " + department.address.city);


        Department department2 = department.clone();

        System.out.println("Department2: " + department2.name);
        department2.address.setCity("Lviv");
        System.out.println("City2: " + department2.address.city);
    }

}
