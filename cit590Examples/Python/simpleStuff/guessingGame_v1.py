#nested if else and elif statements
number = 23
guess = int(input("Enter an integer :"))
if guess == number:
    print("Congratulations, you guessed it.")
elif guess < number:
    print("No, it is a little higher than that") 
else:
    print("No, it is a little lower than that")
# you must have guessed > number to reach here
print("Done")
# This last statement is always executed, after the if statement is executed
