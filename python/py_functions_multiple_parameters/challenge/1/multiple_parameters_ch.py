'''
@goalDescription(Construct a program that calculates the pay and current savings.)
@name(Multiple Parameters)
@distractor{code(paycheck = calculatePay()), helpDescription()}
@distractor{code(paycheck = calculatePay(food)), helpDescription()}
@distractor{code(current_savings = paycheck), helpDescription()}
@distractor{code(current_savings = paycheck + work_hours), helpDescription()}
'''
# Step 1 : Define the calculatePay function that returns the final pay.
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function calculatePay.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''


def calculate_pay(work_hours):
    # Step 1.1: establish base pay rate
    '''@helpDescription(This statement sets the base pay rate.)'''
    base_rate = 10.0
    # Step 1.2 determine total pay based on hours worked (including possible overtime)
    '''@helpDescription(We are using an if-else condition here to check if working hours are less than 40 hours. If it is less than 40 hours, we are calculating the pay by the base rate, if not, we are checking the overtime hours and calculating the overtime pay.)'''
    '''@helpDescription( We start by checking whether the working hours are less than 40 hours. If it is, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
    if work_hours <= 40:
        '''@helpDescription(This statement calculates the pay when work hours is less than 40 hours.)'''
        pay = work_hours * base_rate
    '''@helpDescription(When working hours are more than 40 hours, the else statement gets executed.)'''
    else:
        '''@helpDescription(This statement firstly calculates the overtime hours.)'''
        overtime_hours = work_hours - 40
        '''@helpDescription(This statement calculates the pay of 40 hours.)'''
        normal_pay = 40 * base_rate
        '''@helpDescription(This statement calculates the overtime hours pay.)'''
        overtime_pay = overtime_hours * (base_rate * 1.5)
        '''@helpDescription(This statement calculates the total pay by adding the normal pay and overtime pay.)'''
        pay = normal_pay + overtime_pay
        '''@helpDescription(Return the pay.)'''
    return pay
# Step 2: Define the budget function that returns the current saving
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function budget.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def budget(rent, utilities, food, work_hours, current_savings):
    # Step 2.1:#add up all expenses for the month
    '''@helpDescription(This statement calculates the total expenses.)'''
    total_expenses = rent + utilities + food
    # Step 2.2:calculate total paycheck amount based on hours
    '''@blank(To get the pay amount, this statement invokes the calculate pay function.)'''
    paycheck = calculate_pay(work_hours)
    # Step 2.3: find the current saving after getting paid
    '''@blank(This statement calculates the total amount of the saving)'''
    current_savings = current_savings + paycheck
    # Step 2.4 find the current saving left after expenses
    '''@helpDescription(This statement calculates the current amount of the saving after deducting the total expense.)'''
    current_savings = current_savings - total_expenses
    '''@helpDescription(Return the current saving.)'''
    return current_savings


'''@helpDescription(This statement prints the currenting saving after payday and all the expenses. We invoke the function budget to calculate the remaining savings.)'''
print("after payday and expenses, you will have: ", budget(900, 150, 300, 41, 1500))
