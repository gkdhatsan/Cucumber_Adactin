@Login @Smoke @Regression
Feature: Verify Adactin Hotel Login Details

  #@Test
  #Scenario: Verify Search Hotel By Select By All  Fields
  #  Given User is on Adactin Home Page
  # When User Should Perform Login "<UserName>","<Password>"
  #  | ganesh |
  # | Kumar  |
  Scenario Outline: Verify Adactin Hotel Login With Valid Credentials
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"

    Examples: 
      | UserName   | Password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verify Adactin Hotel Login With Enter Key
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>" Click Enter
    Then User Should Verify Welcome Message After Login "Hello Greens8767!"

    Examples: 
      | UserName   | Password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verify Adactin Hotel Login With Invalid Credentials
    Given User is on Adactin Home Page
    When User Should Perform Login "<UserName>","<Password>"
    Then User Should Verify Error Message After Login "Invalid Login details or Your Password might have expired"

    Examples: 
      | UserName   | Password |
      | Greens8765 | L4R739   |
