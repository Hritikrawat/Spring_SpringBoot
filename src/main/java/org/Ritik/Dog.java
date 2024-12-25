package org.Ritik;




public class Dog
{
    //This is the most generic way of doing this (setting value of a variable ).
    //but as we are making a Spring Project we will do it using xml file.

    //Setter injection.
    private int age;


    public int getAge() {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }

    //Constructor injection
    private Animal ani;

    public Dog(Animal ani)
    {
        this.ani= ani;
    }


    public void sound()
    {
        System.out.println(getClass().getSimpleName()+" has "+ani.four()+"and it BARKS");

    }
}
