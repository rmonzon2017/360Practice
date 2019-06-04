/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacit360practice.JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Rafael.M
 */
public class JSON_Practice {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String Name = input.nextLine();
        // Create a New Object By JSON
        JSONObject root = new JSONObject();
        root.put("Name", Name);

        JSONArray Courses = new JSONArray();

        while (true) {
            System.out.print("Enter your address: ");
            String addres = input.nextLine();

            if (addres.length() == 0) {
                break;
            }
            //Get the grade 
            System.out.print("Enter Last Phone Number: ");
            int Pnumber = input.nextInt();

            if (input.hasNextLine()) {
                input.nextLine();

            }

            // Create JSON object and Array a class Object
            JSONObject Addressone = new JSONObject();
            Addressone.put("Phone Number", Pnumber);
            Addressone.put("Address", addres);

            //Add the course to the array 
            Courses.add(Addressone);
        }
        //Add the array to the root Object 
        root.put("Address", Courses);

        System.out.println(root.toJSONString());

        File file = new File("PersonalInformation.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(root.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }

        System.out.println("File was created Successfully\n\n Hit Return to Display");
        input.nextLine();

        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()) {
                jsonIn.append(input.nextLine());
            }
            System.out.println(jsonIn.toString());

            JSONParser Cloud = new JSONParser();
            JSONObject objroot = (JSONObject) Cloud.parse(jsonIn.toString());

            System.out.printf("Personal Name is %s\n", objroot.get("Name").toString());

            JSONArray addresssIn = (JSONArray) objroot.get("Address");

            for (int i = 0; i < addresssIn.size(); i++) {
                JSONObject AddressIn = (JSONObject) addresssIn.get(i);
                long PNumberIN = (long) AddressIn.get("Phone Number");
                String NameIn = (String) AddressIn.get("Name");

                System.out.printf("Personal %s: Phone Number %d\n", NameIn, PNumberIN);

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());

        }

    }

}
