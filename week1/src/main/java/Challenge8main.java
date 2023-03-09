package main.java;

public class Challenge8main {
    public static void main(String[] args) {
        Challenge8Hospital c = new Challenge8Hospital();

        c.setDate(2013); //goes to Challenge8Hospital and sets the date there
        c.setDepartment("Cardiology");
        c.setVisitors(40);

        System.out.println(c.getDate() + c.getDepartment() + c.getVisitors());

    }
}
