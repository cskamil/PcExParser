'''
@goalDescription(Construct a program that calculates the current savings after getting paid and the total expense.)
@name(Multiple Parameters)
'''
# Step 1 : Define the budget function that returns the current savings.
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function budget that takes five parameters and calculates the current savings.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def budget(rent, utilities, food, paycheck, current_savings):
    # Step 1.1: add up all expenses for the month
    '''@helpDescription(This statement calculates the total expenses)'''
    total_expenses = rent + utilities + food
    # Step 1.2: find total amount left after getting paid
    '''@helpDescription(This statement calculates the total savings after getting paid and before deducting the total expenses.)'''
    current_savings = current_savings + paycheck
    # Step 1.3: find total amount left after expenses
    '''@helpDescription(This statement calculates the current saving after deducting the total expenses.)'''
    current_savings = current_savings - total_expenses
    '''@helpDescription(This statement returns the current saving.)'''
    return (current_savings)
# Step 2: Display the current saving
'''@helpDescription(This statement prints the current savings and invokes the function budget and passes five parameters to the function budget.)'''
print("after payday and expenses, you will have: ""$", budget(900, 150, 300, 700, 1500))