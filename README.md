# Roman Numeral Converter

A simple Java program that converts an integer into its Roman numeral representation.

## 📌 Description

This program takes a decimal (base-10) number as input from the user and converts it to its equivalent Roman numeral using a straightforward greedy algorithm.

### Example

Input: 1987

Output: MCMLXXXVII


## 💡 How It Works

The program uses two arrays:
- `numbers[]` contains decimal values in descending order.
- `roman[]` contains corresponding Roman numeral strings.

It iteratively subtracts the largest possible Roman value and appends the Roman numeral until the entire number is converted.

## 🧠 Core Logic

```java
for (int i = 0; i < numbers.length; i++) {
    while (userInput >= numbers[i]) {
        userInput = userInput - numbers[i];
        sb.append(roman[i]);
    }
}



