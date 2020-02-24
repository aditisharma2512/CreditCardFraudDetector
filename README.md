# Credit Card Fraud Detector

This project will detect fraudulent activity on consumer credit cards based on the following scenario: 
A credit card transaction is comprised of the following elements.
hashed credit card number
timestamp - of format 'year-month-dayThour:minute:second'
amount - of format 'dollars.cents'
Transactions are to be received as a comma separated string of elements.

```
eg. 10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00
```

A credit card will be identified as fraudulent if the sum of amounts for a unique hashed credit card number
over a 24 hour sliding window period exceeds the price threshold.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for testing purposes. See deployment for notes on how to deploy the project on a live system. 

**Please note: This project is exclusively created for Tanya Hodza and associates. Unauthorised copying is prohibited**

### Prerequisites

The following are the system requirements prior to the installation of the project.

1. A PC/Mac/Linux based system with Git installed and configured
2. Java Development Kit installed

### Installing

1. Open command prompt or terminal based on your system
2. Type ```git clone https://github.com/aditisharma2512/CreditCardFraudDetector --depth 1```
3. Traverse the following Directory:

**Command Prompt**
```
cd CreditCardFraudDetector\src\creditcardfrauddetector
```
**Terminal**
```
cd CreditCardFraudDetector/src/creditcardfrauddetector
```
4. Compile the file using ```javac CreditCardFraudDetector.java```
5. Execute the compiled file

## Running the tests


## Built With

* [Netbeans](https://netbeans.org/downloads/8.0.2/) - The Java IDE used
* [GitHub](https://github.com/) - Home of the Repository


## Versioning

This is version 1.0. 

## Authors

* **Aditi Sharma** - *Github Profile* - [AditiSharma](https://github.com/aditisharma2512)
