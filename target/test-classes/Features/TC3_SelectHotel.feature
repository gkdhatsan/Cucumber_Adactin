@Select
Feature: Verify Adactin Hotel Select Hotels Details

  Scenario Outline: Verify Adactin Hotel Select Hotels Book A Hotel
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Fill & Submit All Fields In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User should Select Hotel
    Then User Should Verify  Message After Select Hotel "Book A Hotel"

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Greens8767 | L4R739   | London   | Hotel Sunshine | Deluxe   | 2 - Two       | 14/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Adactin Hotel Without Select Hotels and Verify Error Message
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Fill & Submit All Fields In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User Should Verify Message After Search "Select Hotel"
    And User Should Click Continue Without Select Hotel
    Then User Should Verify Error Message After Continue "Please Select a Hotel"

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Greens8767 | L4R739   | London   | Hotel Sunshine | Deluxe   | 2 - Two       | 14/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |
