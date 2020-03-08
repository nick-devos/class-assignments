# Name: Nick DeVos
# Date: 10/23/2016
# Description: Modifying the pizza ordering system to use Python lists

# Messagebox function call
from setup_messagebox import *

# Lists for pizza size, price, and selection
menu = ['a','b','c','d']
sizes = ['small','medium','large','extra-large']
prices = [7.99,14.99,18.99,22.99]

# Ask for desired pizza size
pizza_choice = input("Let me help you order a pizza, by Nick DeVos.\n\nWhat size "
"pizza would you like?\na. Small($7.99) b. Medium($14.99) c. Large($18.99) "
"d. Extra-Large($22.99)\nPlease enter a, b, c, or d:")
print(pizza_choice)

# Determine index of chosen letter
list_location = menu.index(pizza_choice)

# Find pizza size and price in lists by index
pizza_size = sizes[list_location]
pizza_price = prices[list_location]
display_price = str(pizza_price) # Need to convert pizza_price to string
                                 # in order to use it in input prompt
# Confirm choice and choose amount of pizzas
pizza_amt = input("OK, " + pizza_size + ", that is $" + display_price + " each.\n"
"How many would you like? ")
pizza_amt = int(pizza_amt) # Convert to int for total_price calculation

total_price = pizza_amt * pizza_price # Calculating total
display_total = str(total_price) # Convert total_price to string for messagebox

messagebox.showinfo("Total Price", "Your total is $" + display_total)