import java.util.Scanner;

public class EncodeDecodeMehtaSujana {
     public static void main(String[] args) // main
     {

          Scanner input = new Scanner(System.in);
          System.out.println("This program will read in a message and an offset to encode the message by.");
          System.out.println("It can also be used to decode a message with a given offset.\n");

          EncoderMehtaSujana code = new EncoderMehtaSujana();
          DecoderMehtaSujana decode = new DecoderMehtaSujana();

          System.out.println("\nDo you want to encode or decode a message?");
          System.out.println("\t\t1)Enter 1 to encode.");
          System.out.println("\t\t2)Enter 2 to decode.");

          int num = input.nextInt();
          input.nextLine();

          if (num == 1) {

               System.out.println("Enter the message that you want to encode:");
               String message = input.nextLine();

               System.out.println("Enter the offset to encode with:");
               int offSet = input.nextInt();

               String encodedMessage = code.encodeMessage(message, offSet);
               System.out.println("Encoded message: " + encodedMessage);
               input.nextLine();

               System.out.println("Do you want to decode the message? (Y/N):");
               String msg = input.nextLine();
               String decodedMessage = decode.decodeMessage(encodedMessage, offSet);

               if (msg.equals("Y") || msg.equals("y")) {

                    System.out.println("Decoded message: " + decodedMessage);
               }
               System.out.println("Thanks for using the program.");

               input.close();

          }

          else if (num == 2) {

               System.out.println("Enter the message that you want to decode:");
               String message1 = input.nextLine();

               System.out.println("Enter the offset to encode with:");
               int offSet1 = input.nextInt();

               String decoded = decode.decodeMessage(message1, offSet1);

               System.out.println("Decoded message: " + decoded);
               System.out.println("Thanks for using the program.");

          }
     }

}
