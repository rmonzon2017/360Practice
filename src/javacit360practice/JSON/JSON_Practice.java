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
            System.out.print("Enter Course Name: ");
            String Course = input.nextLine();

            if (Course.length() == 0) {
                break;
            }
            //Get the grade 
            System.out.print("Enter Grade: ");
            int Grade = input.nextInt();

            if (input.hasNextLine()) {
                input.nextLine();

            }

            // Create JSON object and Array a class Object
            JSONObject Courseone = new JSONObject();
            Courseone.put("Grade", Grade);
            Courseone.put("Name", Course);

            //Add the course to the array 
            Courses.add(Courseone);
        }
        //Add the array to the root Object 
        root.put("Courses", Courses);

        System.out.println(root.toJSONString());

        File file = new File("StudentGrades.txt");

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

            System.out.printf("Student Name is %s\n", objroot.get("Name").toString());

            JSONArray CourseIn = (JSONArray) objroot.get("Courses");

            for (int i = 0; i < CourseIn.size(); i++) {
                JSONObject CoursesIn = (JSONObject) CourseIn.get(i);
                long GradeIn = (long) CoursesIn.get("Grade");
                String NameIn = (String) CoursesIn.get("Name");

                System.out.printf("Course %s: Grade %d\n", NameIn, GradeIn);

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());

        }

    }

}
