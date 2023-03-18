@Cancel
Feature: Verify Adactin Hotel Cancel Booking

  Scenario Outline: Verify Adactin Hotel Booking Cancellation
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Fill & Submit All Fields In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User should Select Hotel
    Then User Should Verify  Message After Select Hotel "Book A Hotel"
    And User Should Enter "<FirstName>","<LastName>","<BillingAddress>"
      | CreditCardType  | CreditCardNo     | ExpMonth | ExpYear | CVVNummber |
      | AmericanExpress | 7976969787679874 | December |    2022 |        123 |
      | VISA            | 9876657456778765 | December |    2022 |        456 |
      | MasterCard      | 6756776898789899 | December |    2022 |        789 |
    Then User Should Verify Message After BookNow "Booking Confirmation"
    And User Should Click Cancel OrderNo
    Then User should verify Message After Click Ok "The booking has been cancelled "

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress |
      | Greens8767 | L4R739   | London   | Hotel Sunshine | Deluxe   | 2 - Two       | 14/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         | Ganesh    | Kumar    | Chennai        |

  Scenario Outline: Verify Adactin Hotel Existing Order Id Cancellation
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Cancel Existing "<OrderNo>"
    Then User should verify Message After Click Ok "The booking has been cancelled "

    Examples: 
      | UserName   | Password | OrderNo    |
      | Greens8767 | L4R739   | RB865TNNZY |
