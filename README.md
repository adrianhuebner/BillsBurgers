# OOTP Test from Udemy Class

## Author: Adrian Huebner

### Problem Domain

The point of this application is to help a fake company named Bills Burgers to manage the process of the selling of their burgers. Help select types of burgers, some of the additional items to be added to the burgers and the price.

### What needs to be implemented

- Create a base burger, but also two other types of hamburgers that are popular ones in Bills store
- The basic burger should have the following:
    - Bread roll type
    - Meat
    - Up to 4 additional additions that a customer can be selected to be added to the burger
- Each one of these items gets charged an additional price so you need some way to track how many items got added and calculate the final price (base burger with all the additions)
- This base burger has a base price and the additions are all separately priced
- Create a Hamburger Class to deal with all the above
- The constructor should only include the roll type, meat and price
    - Can also include the name of the burger or a setter can be implemented
- Also create two extra varieties of Hamburgers (subclass) to cater to:
    - Healthy burger (on a brown rye roll), plus two additional items to be added
        - The healthy burger can have 6 items (additions) in total
        - Probably want to process the two additional items in the new class (subclass of Hamburger), not the base class (Hamburger), since the additional items are only appropriate for this new class
    - Deluxe Hamburger comes with chips and drink as additions, but no extra additions are allowed
        - Have to find a way to automatically add these new additions, but no extra additions are allowed
    - All 3 classes should have a method that can be called anytime to show the base price of the hamburger
        - Plus all additions, each showing the addition name, and the addition price, and a grand/final total for the burger(base price + all additions)
    - For the two additional classes this may require you to be looking at the base class for pricing and then adding totals to the price 