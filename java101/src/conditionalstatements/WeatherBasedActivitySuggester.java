/* Write a program that suggests activities based on the weather temperature.
Conditions:
If the temperature is below 5, suggest "Skiing."
If the temperature is between 5 and 15, suggest "Cinema."
If the temperature is between 15 and 25, suggest "Picnic."
If the temperature is above 25, suggest "Swimming." */

package conditionalstatements;

import java.util.Scanner;

public class WeatherBasedActivitySuggester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature;

        System.out.print("\nPlease Enter The Temperature : ");
        temperature = input.nextInt();

        if (temperature <= 5) {
            System.out.print("\nYou Can Go Skiing.\n");
        } else if (temperature <= 15) {
            System.out.print("\nYou Can Go To The Cinema.\n");
        } else if (temperature <= 25) {
            System.out.print("\nYou Can Go On A Picnic.\n");
        } else {
            System.out.print("\nYou Can Go Swimming.\n");
        }

    }
}