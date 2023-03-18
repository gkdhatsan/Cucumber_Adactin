@Search
Feature: Verify Adactin Hotel Search Hotel Details

  #Background: 
   # Given User is on Adactin Home Page
   # When User Should Perform Login "<UserName>","<Password>"
   # Then User Should Verify Welcome Message After Login "Hello Greens8767!"
 
  Scenario Outline: Verify Search Hotel By Select By All  Fields
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Fill & Submit All Fields In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User Should Verify Message After Search "Select Hotel"

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Greens8767 | L4R739   | London   | Hotel Sunshine | Deluxe   | 2 - Two       | 14/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Search Hotel By Select only Mandatry Fields
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767"
    And User Should Fill & Submit Only Mandatry Fields In Search Hotel Page "<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>" and "<AdultsperRoom>"
    Then User Should Verify Message After Search "Select Hotel"

    Examples: 
      | UserName   | Password | Location | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | Greens8767 | L4R739   | London   | 2 - Two       | 14/08/2022  | 16/08/2022   | 2 - Two       |

  Scenario Outline: Verify Search Hotel Page With Invalid CheckIn and CheckOut Date
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Fill & Submit All Fields In Search Hotel Page "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    Then User should verify Invalid Date Error Message After Search "Check-In Date shall be before than Check-Out Date","Check-Out Date shall be after than Check-In Date"

    Examples: 
      | UserName   | Password | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Greens8767 | L4R739   | London   | Hotel Sunshine | Deluxe   | 2 - Two       | 14/08/2022  | 16/08/2020   | 2 - Two       | 2 - Two         |

  Scenario Outline: Verify Search Hotel Page Without Enter Any Field Click Search
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"
    And User Should Submit Search Hotel Page Without Filling Any Field
    Then User Should Verify Error Message After Search "Please Select a Location"

    Examples: 
      | UserName   | Password |
      | Greens8767 | L4R739   |
