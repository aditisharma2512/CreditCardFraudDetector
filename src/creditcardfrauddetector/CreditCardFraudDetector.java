/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcardfrauddetector;

import java.io.IOException;
import java.util.*; 
import java.io.*; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author aditisharma
 */
public class CreditCardFraudDetector {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length != 2)
        {
            System.err.println("Incorrect number of arguments");
            System.exit(1);
        }
        else
        {
            new CreditCardFraudDetector().StartDetector(args[0], args[1]);
        }
    }
    
    public void StartDetector(String filePath, String threshold)
    {
        double priceThreshold = 0.0;
        
        try{
            priceThreshold = Double.parseDouble(threshold);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Incorrect Amount Argument");
        }
        
        FraudDetection fraudDetection = new FraudDetection();
		List<CardTransaction> transactionList = null;
		try {
			transactionList = fraudDetection.readTransactionsFromFile(filePath);
		} catch (DateTimeParseException e) {
			System.err.println("Incorrect datetime format in the file");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.err.println("Threshold amount is in incorrect format in the sample file");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("File not found, provide a valid path");
			System.exit(1);
                }
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.err.println("One line is malformated");
//			System.exit(1);
//		}
        Set<String> fraudCardNumbers = null;
        fraudCardNumbers = fraudDetection.detectFraud(transactionList, priceThreshold);
        logFraud(fraudCardNumbers);
        
    }
    
    private void logFraud(Set<String> fraudCardNumbers)
    {
        if(fraudCardNumbers.isEmpty()) {
			System.out.println("No fraud detected in the transactions.");
		}
		for(String fraud : fraudCardNumbers) {
			System.out.println("Fraud detected on hashed card number "+fraud);
		}

        
    }
    
}
