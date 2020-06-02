//ABAYOMI GRACE

import java.util.Scanner;
public class CovidTest {
    public static void main(String... args){
        Covid checklist = new Covid();
        Scanner input = new Scanner(System.in);

        String response = "yes";

      System.out.println("please answer with yes or no in lower case");
      System.out.println("To terminate the program, press x");
        int point = 0;
        while(response != "x"){
          System.out.println("Do you have cough?");
          response = input.next();
          if (response.equals("yes")){
              point += checklist.cough();
          }


          System.out.println("Do you have runny nose?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.runnyNose();
          }


         System.out.println("Do you have diarrhea?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.diarrhea();
          }

          System.out.println("Do you experience headache?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.headache();
          }

          System.out.println("do you experience MYALGIA or bodyache?");
          response = input.next();
            if(response.equals("yes")){
              point += checklist.myalgia();
          }

          System.out.println("do you have sore throat?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.soreThroat();
          }

          System.out.println("Are you having high fever?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.fever();
          }


          System.out.println("Are you having difficulty breathing?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.breathing();
          }

          System.out.println("Are you experiencing fatigue?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.fatigue();
          }


          System.out.println("Have you travelled recently during the past 14 days?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.travel();
          }

          System.out.println("Do you have a travel history to COVID-19 infected area?");
          response = input.next();
          if (response.equals("yes")) {
             point += checklist.history();
          }

          System.out.println("Do you have direct contact or taking care of a positive COVID-19 patient?");
          response = input.next();
          if (response.equals("yes")) {
              point += checklist.contact();
          }

          break;

      }
        System.out.printf("%d points%n", point);

        if(point <= 2){
            System.out.println("Symptoms may be stress related. Rest and observe.");
        }
        else if(point >= 3 && point <= 5){
            System.out.println("Hydrate properly and observe proper personal hygiene.");
            System.out.println("Observe and reevaluate after 2 days");
        }
        else if(point >= 6 && point <= 12){
            System.out.println("Consult a doctor!");
        }
        else if(point >= 12 && point <= 20){
            System.out.println("CALL THE NCDC HOTLINE 080097000010");
        }
        else{
            System.out.println("End of program");
        }

    }

}
