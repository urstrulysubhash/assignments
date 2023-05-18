package main.com.jc.assignment.JCA1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JCAMain {
    public static void main(String[] args) throws Exception {
        //read_companies_file();
        try{
            List<Company> arraylist = read_companies_file();
            System.out.println("---------");
            System.out.println("Question4");
            System.out.println("Get all companies that starts with A");
            Iterator<Company> itr = arraylist.iterator();
            while (itr.hasNext()){
                Company c = itr.next();
                if (c.getName().startsWith("A")){
                    System.out.println(c.getName());
                }
            }
            System.out.println("---------");
            System.out.println("Question5");
            System.out.println("Get all companies where no of employees greater than 200000");
            Iterator<Company> itr1 = arraylist.iterator();
            while(itr1.hasNext()){
                Company c = itr1.next();
                if (c.getNoOfEmployees()<20){
                    System.out.println(c.getName());
                }
            }
            System.out.println("---------");
            System.out.println("Question6");
            System.out.println("Get all companies in zip code: 50020");
            Iterator<Company> itr2 = arraylist.iterator();
            while(itr2.hasNext()){
                Company c = itr2.next();
                if (c.getZip() == 50020){
                    System.out.println(c.getName());
                }
            }
            System.out.println("---------");
            System.out.println("Question7");
            System.out.println("Print all companies in the below format. --> [companyName, ein, ticker]");
            Iterator<Company> itr3 = arraylist.iterator();
            while (itr3.hasNext()){
                Company c = itr3.next();
                System.out.println(c.getName() + ","+c.getEin()+","+c.getTicker());
            }
            System.out.println("---------");
            System.out.println("Question8");
            System.out.println("Print address of all companies in below format. -->[companyName, address1, address2, address3, state, city, zip]");
            Iterator<Company> itr4 = arraylist.iterator();
            while (itr4.hasNext()){
                Company c = itr4.next();
                System.out.println(c.getName() + "," + c.getAddress1() + "," + c.getAddress2() + "," + c.getAddress3() + "," + c.getState() + "," +  c.getCity() + "," + c.getZip());
            }
            System.out.println("---------");
            System.out.println("Question9");
            System.out.println("Calculate total no of employees working in all companies");
            int count = 0;
            Iterator<Company> itr5 = arraylist.iterator();
            while (itr5.hasNext()){
                Company c = itr5.next();
                count = count + c.getNoOfEmployees();
                System.out.println(count);
            }
            System.out.println("---------");
            System.out.println("Question10");
            System.out.println("Find the company with highest and lowest no of employees.");
            int maxEmployees = 0;
            int minEmployees = Integer.MAX_VALUE;
            String companyWithMaxEmployees = null;
            String companyWithMinEmployees = null;
            Iterator<Company> itr6 = arraylist.iterator();
            while(itr6.hasNext()) {
                Company c = itr6.next();
                if (c.getNoOfEmployees() > maxEmployees) {
                    maxEmployees = c.getNoOfEmployees();
                    companyWithMaxEmployees = c.getName();
                }
                if (c.getNoOfEmployees()< minEmployees) {
                    minEmployees = c.getNoOfEmployees();
                    companyWithMinEmployees = c.getName();
                }
            }
            System.out.println(companyWithMaxEmployees);
            System.out.println(companyWithMinEmployees);


        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static List<Company> read_companies_file() throws Exception {
        List<Company> arraylist = new ArrayList<>();
        System.out.println("---------");
        System.out.println("This is checked exception");

        File file = new File("/Users/nanivanga/Downloads/java-beginner-programs-feature-Ticket-1-java-oops-concepts-2/src/main/resources/companies.txt");
        FileReader fi = new FileReader(file);
        BufferedReader br = new BufferedReader(fi);
        String line;
      //  br.lines().forEach(line -> System.out.println(line));
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            if (columns.length == 10) {
                String name = columns[0];
                String ein = columns[1];
                int noOfEmployees = Integer.parseInt(columns[2].trim());
                String address1 = columns[3];
                String address2 = columns[4];
                String address3 = columns[5];
                String state = columns[6];
                String city = columns[7];
                int zip = Integer.parseInt(columns[8].trim());
                String ticker = columns[9];

                Company company = new Company(name, ein, noOfEmployees, address1, address2, address3, state, city, zip, ticker);
                arraylist.add(company);
            }
        }
        return arraylist;
    }


}
